import org.junit.Test;

public class UralTest extends Base {

    @Test
    public void loginPhone() throws InterruptedException {

        driver.get("https://lk.esk-ural.ru/login");

        String loginPhone = "9273792477";
        String loginPass = "111111Qw";

        loginPageUral page = new loginPageUral();

        page.loginUralPhone(loginPhone, loginPass);

        Thread.sleep(5000);

        String currentUrl = driver.getCurrentUrl();

        //Assert.assertTrue(currentUrl.contains("https://ikus.pesc.ru/payments/individual/groups"));



    }

}
