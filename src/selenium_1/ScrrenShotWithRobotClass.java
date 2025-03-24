package selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScrrenShotWithRobotClass {
        public static void main(String[] args) throws IOException, AWTException {
            System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.com/");

            //Initiate the class
            Robot ss = new Robot();
            //Get the dimension of the screen
            Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
            //use rectangle as most monitors are in this shape
            Rectangle  rectangle = new Rectangle(ScreenSize);
            //take screenshot with the dimension we got from above
            BufferedImage SourceLocation = ss.createScreenCapture(rectangle);
            // Show the destination file
            File Destination = new File("/Users/johragup/Downloads/sample1.png");
            //copy paste the file from selenium to local host
            ImageIO.write(SourceLocation, "png", Destination );



        }
    }


