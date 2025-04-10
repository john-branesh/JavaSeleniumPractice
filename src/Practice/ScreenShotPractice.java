package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShotPractice {
    public static void main (String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com");

        //WebElement logo = driver.findElement(By.id("nav-bb-logo"));

        //File logoss = logo.getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(logoss, new File("Screeshots/sample.png"));

        try {
            //Taking Screenshot
            TakesScreenshot ss = (TakesScreenshot) driver;

            //save the screenshot as file and mention its source file
            File source = ss.getScreenshotAs(OutputType.FILE);
            //save ss to target location
            FileUtils.copyFile(source, new File("amazonlanding.png"));

            System.out.println("ScreenShot captured");
        }
        catch (IOException e){
            System.out.println("Error while taking screenshot: " + e.getMessage());
        } finally {
            // 5️⃣ Close Browser
            driver.quit();
        }
    }
}
