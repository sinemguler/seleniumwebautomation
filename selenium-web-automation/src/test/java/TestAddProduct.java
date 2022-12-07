import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestAddProduct extends BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage;

    @Test
    @Order(1)
    public void searchProduct() {
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("Ceket");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }

    @Test
    public void allShowProduct() {

    }

    @Test
    @Order(2)
    public void selectProduct() {
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
        "Not on product detail page!");
    }

    @Test
    @Order(3)
    public void addProductCard() {
        productDetailPage.addCard();
        Assertions.assertTrue(homePage.isProductCountUp(),
        "Product count did not increase!");

    }

    @Test
    @Order(4)
    public void goToCard() {
        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue(cardPage.checkIfProductAdded(),
        "Product was not added to card!");


    }


}
