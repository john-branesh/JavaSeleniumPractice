package selenium_1;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class PrintGoogleSuggestions {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in/");

        //searching a term in search box
        WebElement Search = driver.findElement(By.xpath("//textarea[@title='Search']"));
        Search.sendKeys("assasin");

        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Thread.sleep(6000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        List <WebElement> Suggestions = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy
                ((By.xpath("//ul[@role='listbox']//li"))));

        //List<WebElement> Suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));

        for (WebElement hints : Suggestions){
            System.out.println(hints.getText());
        }

    }

}
