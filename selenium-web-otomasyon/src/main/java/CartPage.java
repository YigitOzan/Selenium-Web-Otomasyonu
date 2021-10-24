import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{

    By ProductCount = By.id("spanCart");
    By AddButton = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div/a[2]");
    By RemoveButton = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div/a[1]");
    By RemoveButton2 = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/a[1]");
    By NullCartText = By.xpath("/html/body/div[3]/div[3]/div[2]/div[1]/div/div/p[1]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void addProduct() {
        click(AddButton);


    }
    public int productcountcheck(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String productcount = find(ProductCount).getText();
        int intproductcount = Integer.parseInt(productcount);
        return intproductcount;
    }

    public boolean isProductCountUp() {
        return productcountcheck() > 1;
    }


    public void removeCartProduct() {
        click(RemoveButton);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(RemoveButton2);
    }

    public boolean isProductRemove() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String text = find(NullCartText).getText();
        return text.equals("Sepetinizde ürün bulunmamaktadır.");
    }
}
