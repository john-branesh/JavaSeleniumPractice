//package Practice;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import java.io.File;
//import java.io.IOException;
//
//public class ScreenshotHelper {
//    public static void takeScreenshot(WebDriver driver, String fileName) {
//
//        try {
//            File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(Screenshot, new File(fileName));
//
//            System.out.println("Screenshot stored in " + fileName);
//        } catch (IOException e) {
//            System.out.println("error saving screenshot: " + e.getMessage());
//        }
//    }
//}
