import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailPage extends BasePage{

    By ProductDetails = By.id("accordion");
    By AddToCartButton = By.id("pd_add_to_cart");
    By SelectSize = By.xpath("/html/body/div[5]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[1]/div[2]/div/div[1]/div[3]/a[1]");



    public ProductDetailPage(WebDriver driver) {
        super(driver);

    }
    public void addToCart() {
        String kelime ="139,99 TL";
        String ilk = kelime.substring(0,3);
        int ilkk = Integer.parseInt(ilk);
        System.out.println(ilkk);




        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        click(SelectSize);
        click(AddToCartButton);
    }
    public boolean isOnProductDetailPage() {
        return isDisplayed(ProductDetails);
    }



    public void goToCart() {
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/sepetim");


    }

}
