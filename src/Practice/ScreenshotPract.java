package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenshotPract {
    public static void main (String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://freecrm.com/en");

        try {
            TakesScreenshot click = (TakesScreenshot) driver;
            File SourceImage = click.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(SourceImage, new File("Sample.txt"));
        } catch (Exception e) {
            System.out.println("error occured: "+ e.getMessage());
        }
    }
}
