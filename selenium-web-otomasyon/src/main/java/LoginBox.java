import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class LoginBox extends BasePage{

    By loginEmailBox = By.name("LoginEmail");
    By passwordBox = By.id("Password");
    By loginButton = By.id("loginLink");


    public LoginBox(WebDriver driver) {
        super(driver);
    }


    public void login(String email, String password){

        type(loginEmailBox, email);
        type(passwordBox, password);

        click(loginButton);
    }
}
