package selenium_1;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;


public class AmazonDropDownFix {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000); // Allow page to load

        // Find and click dropdown to make it active
        WebElement dropdownButton = driver.findElement(By.id("nav-search-dropdown-card"));
        dropdownButton.click();
        Thread.sleep(2000); // Small wait for dropdown options to appear

        // Now find the dropdown list
        WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));

        // Create Select object
        Select select = new Select(dropdownElement);

        // Get all available options
        List<WebElement> options = select.getOptions();
        System.out.println("Total options available: " + options.size());

        // Print each option text
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
}

