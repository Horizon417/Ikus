import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ikus {

    public void run() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();
    }


    public void runmobile() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement emailLoginButton = driver.findElement(By.xpath("//button[text()='Войти по почте']"));
        emailLoginButton.click();


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("ablov2005@yandex.ru");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


    }


    public void goToIndications() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


        Thread.sleep(3000);

        WebElement indications = driver.findElement(By.xpath("//a[contains(@href,'/indications/individual')][1]"));
        indications.click();


        Thread.sleep(5000);

        WebElement myGroup = driver.findElement(By.xpath("//*[text()[contains(.,'Моя группа')]][1]"));
        myGroup.click();
        Thread.sleep(5000);

        WebElement indicationButton = driver.findElement(By.xpath("//button[@type='button' and contains(., 'Передать показания')]"));
        indicationButton.click();


    }

    public void payment() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


        Thread.sleep(7000);


        List<WebElement> buttons = driver.findElements(By.xpath("//*[@class= 'ng-star-inserted'  and text() = 'Детализация']"));
        WebElement details = buttons.get(2);
        details.click();


        WebElement payButton = driver.findElement(By.xpath("//button[@type='button' and contains(., 'Оплатить')]"));
        payButton.click();

    }


    public void paymentAvailable() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


        Thread.sleep(7000);

        //на странице нет //*[text()[contains(.,'временно недоступна')]]


    }


    public void indicationsAvailable() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();


        Thread.sleep(3000);

        WebElement indications = driver.findElement(By.xpath("//a[contains(@href,'/indications/individual')][1]"));
        indications.click();


        Thread.sleep(5000);

        //на странице нет //*[text()[contains(.,'временно недоступна')]]

    }


    public void getMeterInfo() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        Thread.sleep(3000);


        WebElement accountInfo = driver.findElement(By.xpath("//a[contains(@href,'/accounts/11759412')]"));
        accountInfo.click();

    }


    public void openBill() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        Thread.sleep(3000);

        List<WebElement> bills = driver.findElements(By.xpath("//button[@type='button' and contains(., 'Счёт за')]"));
        WebElement bill = bills.get(0);
        bill.click();

        //button[@type='button' and contains(., 'Счёт за')]

    }


    public void openHistory() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ikus.pesc.ru/auth/login");

        Thread.sleep(5000);


        WebElement login = driver.findElement(By.xpath("//input[1]"));

        login.click();
        login.sendKeys("9516673035");


        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));

        pass.click();
        pass.sendKeys("Prom_test2023");


        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        Thread.sleep(3000);

//

        driver.get("https://ikus.pesc.ru/history");

        ////a[contains(@href,'/history')]

        //button[@type='button' and contains(., 'Счёт за')]

    }


//*[text()[contains(.,'Ещё')]]


//
//*[text()[contains(.,'Информация о приборе учёта')]]

//*[text()[contains(.,'Счёт за')]] - и счет, и История


//*[text()[contains(.,'Счёт за')]]  История
    //*[text()[contains(.,'Показания от')]]

    //*[text()[contains(.,'Платеж от')]]


}
