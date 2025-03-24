package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotPractice {
    public static void main (String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");

        //TAking Screenshot
        TakesScreenshot ss = (TakesScreenshot) driver;
        //save the screenshot as file and mention its source file
        File source = ss.getScreenshotAs(OutputType.FILE);
        //save ss to target location
        FileUtils.copyFile(source, new File("amazonlanding.png"));
    }
}
