import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  extends BasePage{

    By loginClick = By.className("dropdown-toggle");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    By HomePageChk = By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[10]");



    public boolean HomePageCheck() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return isDisplayed(HomePageChk);
    }

    public void loginclick() {
        click(loginClick);
    }


}
