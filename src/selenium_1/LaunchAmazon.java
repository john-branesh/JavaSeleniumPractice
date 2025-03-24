package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LaunchAmazon {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");

        //Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("searchDropdownBox"))));

        WebElement All = driver.findElement(By.id("nav-search-dropdown-card"));
        All.click();


        //WebElement automotive = driver.findElement(By.xpath("//select[@id='searchDropdownBox']/child::option[@value='search-alias=beauty-intl-ship']"));
        //automotive.click();

        //WebElement AllDropdown = driver.findElement(By.id("searchDropdownBox"));
        //Select select = new Select(AllDropdown);
        //select.selectByValue("search-alias=hpc-intl-ship");


        // Click the dropdown to open it
        //WebElement dropdownButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-dropdown-card")));
        //dropdownButton.click();
        //Thread.sleep(2000);  // Wait for options to be visible

        // Scroll into view using JavaScript
        WebElement optionToSelect = driver.findElement(By.xpath("//select[@id='searchDropdownBox']/option[@value='search-alias=hpc-intl-ship']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", optionToSelect);
        Thread.sleep(1000);

        // Click the option
        optionToSelect.click();

        System.out.println("Dropdown option selected successfully!");




    }
}
