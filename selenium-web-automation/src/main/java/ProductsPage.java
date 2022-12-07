import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
    By productInformation = By.xpath("//*[@id=\"pagedListContainer\"]/div[1]/div");
    By productNameLocator = By.xpath("//*[@id=\"product-133233\"]");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(productInformation);

    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts() {
        return findAll(productNameLocator);
    }
}
