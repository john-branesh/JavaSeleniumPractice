package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InteractWithLinkComponents {
    public static void main(String[] args)
    {
        //define search engine location
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        //open browser
        WebDriver driver = new FirefoxDriver();
        //open google.co.in
        driver.get("https://www.leafground.com/button.xhtml");
        //enter search term
        driver.findElement(By.linkText("Click")).click();
    }
}
