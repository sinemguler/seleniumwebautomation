import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver =driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return  driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator, String text){ //eleman bulup bir şeyler yazar
        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator){ //görünüp görünmediğine bakar
        return find(locator).isDisplayed();
    }
}
