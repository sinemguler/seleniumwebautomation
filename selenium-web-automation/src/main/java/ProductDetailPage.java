import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By addToCardButtonLocator = By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[2]/div/div[6]/button[2]");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCardButtonLocator);
    }

    public void addCard() {
        click(addToCardButtonLocator);
    }
}
