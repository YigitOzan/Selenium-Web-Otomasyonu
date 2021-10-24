import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    LoginBox loginBox;

    public LoginPage(WebDriver driver) {
        super(driver);
        loginBox = new LoginBox(driver);
    }

    public LoginBox loginBox() {
        return this.loginBox;
    }


}
