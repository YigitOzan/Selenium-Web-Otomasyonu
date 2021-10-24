import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class LoggedinPage extends BasePage{

    SearchBox searchBox;
    By accountText = By.className("dropdown-label");

    public LoggedinPage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public boolean isOnLoginPage() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text = find(accountText).getText();
        return  text.equals("Hesabım");

    }

    public SearchBox searchBox() {
        return this.searchBox;
    }


}
