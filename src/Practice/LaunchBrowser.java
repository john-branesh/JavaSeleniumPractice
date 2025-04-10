package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        //mentioning the driver location and its name
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        //Calling the driver for this function or method
        WebDriver driver = new FirefoxDriver();
        //opening the browser
        driver.get("https://www.google.com");

        // Getting the page title
        String PageTitile = driver.getTitle();

        // print hte page title
        System.out.println(PageTitile);

    }
}
