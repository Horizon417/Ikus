import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class IkusTest extends Base{

    String URL;
    String PHONE;
    String EMAIL;
    String PASSWORD;

    @Before
    public void init() throws IOException {
        System.getProperties().load(ClassLoader.getSystemResourceAsStream("ikus.properties"));
        URL = System.getProperty("url");
        PHONE = System.getProperty("loginPhone");
        EMAIL = System.getProperty("email");
        PASSWORD = System.getProperty("loginPass");
    }
    public void basicLogin() throws InterruptedException {
        driver.get(URL);

        loginPage page = new loginPage();

        page.loginPhone(PHONE, PASSWORD);

        Thread.sleep(5000);
    }

    @Test
    public void loginEmail() throws InterruptedException {

        driver.get("https://ikus.pesc.ru/auth/login");

        String email = "ablov2005@yandex.ru";
        String loginPass = "Prom_test2023";

        loginPage page = new loginPage();

        page.loginEmail(email, loginPass);

        Thread.sleep(5000);

        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("https://ikus.pesc.ru/payments/individual/groups"));
    }

    @Test
    public void paymentAvailable() throws InterruptedException {

        basicLogin();

        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(text(), 'Оплата временно недоступна')]")).isEmpty());
    }

    @Test
    public void indicationsAvailable() throws InterruptedException {

        basicLogin();

        WebElement indicationsButton = driver.findElement(By.xpath("//a[contains(@href,'/indications/individual')][1]"));
        indicationsButton.click();

        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(text(), 'Передача показаний временно недоступна')]")).isEmpty());
    }

    @Test
    public void makePayment() throws InterruptedException {

        basicLogin();

        List<WebElement> buttons = driver.findElements(By.xpath("//*[@class= 'ng-star-inserted'  and text() = 'Детализация']"));
        WebElement details = buttons.get(1);
        details.click();

        WebElement payButton = driver.findElement(By.xpath("//button[@type='button' and contains(., 'Оплатить')]"));
        payButton.click();

        Thread.sleep(20000);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://pg.payconnect.ru/"));
    }

    @Test
    public void getMeterInfo() throws InterruptedException {

        basicLogin();

        WebElement accountInfo = driver.findElement(By.xpath("//a[contains(@href,'/accounts/11759412')]"));
        accountInfo.click();

        Thread.sleep(5000);

        WebElement meterInfo = driver.findElement(By.xpath("//*[contains(text(), 'Информация о приборе учёта')]"));
        meterInfo.click();

        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(), 'Номер ПУ')]")).isEmpty());
    }

    @Test
    public void openBill() throws InterruptedException {

        basicLogin();

        List<WebElement> bills = driver.findElements(By.xpath("//button[@type='button' and contains(., 'Счёт за')]"));
        WebElement bill = bills.get(0);
        bill.click();

        Thread.sleep(5000);

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        Assert.assertTrue(driver.getCurrentUrl().contains("blob:https://ikus.pesc.ru/"));
    }

    @Test
    public void openHistory() throws InterruptedException {

        basicLogin();

        driver.get("https://ikus.pesc.ru/history");

        Thread.sleep(5000);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ikus.pesc.ru/history/indications"));
    }

    @Test
    public void openHistoryAndCheckBills() throws InterruptedException {

        basicLogin();

        driver.get("https://ikus.pesc.ru/history");

        Thread.sleep(5000);

        Assert.assertFalse(driver.findElements(By.xpath("//*[contains(text(), 'Счёт за')]")).isEmpty());
        }
}
