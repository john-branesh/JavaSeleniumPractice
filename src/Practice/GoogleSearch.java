package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearch {
    public static void main(String[] args) {
//mentioning the driver location and its name
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        //Calling the driver for this function or method
        WebDriver driver = new FirefoxDriver();
        //opening the browser
        driver.get("https://www.google.com");

        try {

            //Find the location of search box
            WebElement searchbox = driver.findElement(By.id("APjFqb"));
            //Enter the req text in search box
            searchbox.sendKeys("Selenium WebDriver");
            //Press enter to search the text entered
            searchbox.sendKeys(Keys.ENTER);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfAllElements());

            //Get the title of new page
            String PageTitle = driver.getTitle();
            //print the title of new page
            System.out.println(PageTitle);
        } catch (RuntimeException e) {
            System.out.println("Something went wrong " + e.getMessage());
            e.printStackTrace();
            driver.quit();
        }
        }

    }

