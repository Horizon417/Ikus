import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class mainPage extends loginPage {
       private WebElement login = driver.findElement(By.xpath("//input[1]"));
    private WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
    private WebElement subButton = driver.findElement(By.xpath("//button[@type='submit']"));
    private WebElement indicationsButton;



//    public mainPage login(String phone, String pass){
//
//        login.click();
//        login.sendKeys(phone);
//        password.click();
//        password.sendKeys(pass);
//        subButton.click();
//        return this;
//    }
//    public mainPage indications() {
//        indicationsButton = driver.findElement(By.xpath("//a[contains(@href,'/indications/individual')][1]"));
//        indicationsButton.click();
//        return this;
//    }

}
