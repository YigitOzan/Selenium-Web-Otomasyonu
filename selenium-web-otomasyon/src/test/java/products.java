import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class products extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;
    LoggedinPage loggedinPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void login_product(){
        //sağ üstten logine tıkla mail ve şifre yaz
        //giriş yap butonuna tıkla
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loggedinPage = new LoggedinPage(driver);
        Assertions.assertTrue(homePage.HomePageCheck(), "Home Page Not Opened");
        homePage.loginclick();
        loginPage.loginBox.login("yozan.acaroglu@gmail.com","testiniumodev1");
        Assertions.assertTrue(loggedinPage.isOnLoginPage(), "Not Login Page");


    }
    @Test
    @Order(2)
    public void Search(){
        //arama kutusuna pantolan yaz ve aramaya tıkla
        loggedinPage.searchBox().search("pantolan");
    }

    @Test
    @Order(3)
    public void select_product(){
        //sayfanın sonuna scroll et ve daha fazla ürüne tıkla
        //rastgele bir ürün seç sepete ekle
        productsPage = new ProductsPage(driver);
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct();
        Assertions.assertTrue(productDetailPage.
                isOnProductDetailPage(), "Not on product detail page!");

    }
    @Test
    @Order(4)
    public void add_cart(){
        //ürünü sepete ekle
        //sepete git

        productDetailPage.addToCart();
        productDetailPage.goToCart();

    }

    @Test
    @Order(5)
    public void add_count(){
        //ürün adedini artır ve doğrula
        cartPage = new CartPage(driver);
        cartPage.addProduct();
        Assertions.assertTrue(cartPage.isProductCountUp(),
                "Product count did not up");
    }
    @Test
    @Order(6)
    public void remove(){
        //sepeti boşalt ve kontrol et.
        cartPage.removeCartProduct();
        Assertions.assertTrue(cartPage.isProductRemove(),
                "Product is not remove");
    }
}
