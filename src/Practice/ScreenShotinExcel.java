package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ScreenShotinExcel {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        try {
            driver.get("https://www.amazon.com");
            savesstoexcel(driver, "ss.xlsx");
        } catch (Exception e) {
            System.out.println("error: "+ e.getMessage());
        }
        finally {
            driver.quit();
        }



    }

    private static void savesstoexcel(WebDriver driver, String s) throws IOException {

            // Take Screenshot
            File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            // Save Screenshot Using FileUtils
            String imagepath = "ss.png";
            FileUtils.copyFile(screenshot, (new File(imagepath)));
            System.out.println("image save as :"+imagepath);



    }

}
