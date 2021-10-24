import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;


public class ProductsPage extends BasePage{


    By SelectProduct = By.id("model_2229509_5333870");
    By MoreProductButton = By.xpath("/html/body/div[5]/div[3]/div[2]/div[7]/div/div[4]/a");



    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void selectProduct() {
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,15000);");
        click(MoreProductButton);

        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(SelectProduct);
    }
}
