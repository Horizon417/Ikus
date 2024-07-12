import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginPageUral extends BaseSeleniumPage {

    private WebElement login = driver.findElement(By.xpath("//*[@id='username']"));
    private WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
    private WebElement subButton = driver.findElement(By.xpath("//button[@type='submit']"));
    private WebElement loginEmailButton = driver.findElement(By.xpath("//*[contains(text(), 'Войти по почте')]"));
    private WebElement loginEmailInput;


    public loginPageUral loginUralPhone(String phone, String pass){
        login.click();
        login.sendKeys(phone);
        password.click();
        password.sendKeys(pass);
        subButton.click();
        return this;
    }

    public loginPageUral loginEmail(String email, String pass) throws InterruptedException {
        loginEmailButton.click();
        loginEmailInput = driver.findElement(By.xpath("//input[1]"));
        loginEmailInput.click();
        loginEmailInput.sendKeys(email);
        password.click();
        password.sendKeys(pass);
        subButton.click();
        return this;
    }
}
