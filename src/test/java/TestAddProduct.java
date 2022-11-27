import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestAddProduct {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.network.com.tr/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]")));
        WebElement search = driver.findElement(By.id("search"));
        search.sendKeys("ceket", Keys.ENTER);
        Thread.sleep(5000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button")));
        WebElement showMoreProducts = driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button"));
        showMoreProducts.click();

        List<WebElement> items = driver.findElements(By.className("products__item"));
        WebElement myElement;
        String text = items.get(0).getText();
        System.out.println(text);
    }
}
