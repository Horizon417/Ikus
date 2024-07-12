import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nsd {
    public void run() {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
 /*
        driver.get("https://ikus.pesc.ru/auth/login");
        driver.wait(500);
        WebElement loginInput = driver.findElement(By.xpath("//*[@title='Телефон']"));


        loginInput.click();

    */

        driver.get("https://nsd.sigma-it.ru:8080/sd/");

        WebElement loginInput = driver.findElement(By.id("username"));
        loginInput.click();
        loginInput.sendKeys("yuablov");

        WebElement passwordInput = driver.findElement(By.id("password"));

        passwordInput.sendKeys("wfojB_+417");

        WebElement button = driver.findElement(By.xpath("//*[@class='submit-button']"));

        button.click();

        //driver.wait(500);


        //WebElement ticket = driver.findElement(By.xpath("//a[contains(@class, 'gwt-Label') and text() = 'Заявки']"));

        //ticket.click();
        driver.get("https://nsd.sigma-it.ru:8080/sd/operator/#uuid:employee$173333570!%7B%22tab%22:%22fa8a2972-1374-012c-0000-ffffffffcaa59cd9%22%7D");

        WebElement ticket = driver.findElement(By.xpath("//*[text() = 'Передана в ГП']"));
        ticket.click();



    }
}
