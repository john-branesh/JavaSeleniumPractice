package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OpenAmazonAndLogIn {
    public static void main(String[] args)
    {
        //define search engine location
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        //open browser
        WebDriver driver = new FirefoxDriver();
        //open amazon.in
        driver.get("https://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //click sign in
        //driver.findElement(By.id("nav-link-accountList")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("nav-link-accountList")).click();
        //driver.findElement(By.linkText("Sign in")).click();
        //driver.findElement(By.className("nav-action-inner")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("ap_email")).sendKeys("srkmarm+0-1736155899177wyzy@amazon.com");
        driver.findElement(By.id("continue")).click();
    }
}
