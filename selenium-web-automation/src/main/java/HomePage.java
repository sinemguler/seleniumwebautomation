import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class HomePage extends BasePage {
    SearchBox searchBox;
    By cardCountLocator = By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]/button/span");
    By cardContainerLocator = By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]/button/svg/use");//
    public HomePage(WebDriver driver) {

        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCardCount() > 0;
    }

    public void goToCard() {
        click(cardContainerLocator);

    }

    private int getCardCount() {
        String count = find(cardCountLocator).getText();
        return Integer.parseInt(count);
    }
}
