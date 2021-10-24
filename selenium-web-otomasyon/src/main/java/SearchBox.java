import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SearchBox extends BasePage{

    By submitButton = By.className("searchButton");
    By searchBox = By.id("search_input");



    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        click(searchBox);
        type(searchBox, text);
        click(submitButton);
    }
}
