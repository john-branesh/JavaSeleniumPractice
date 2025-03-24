package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

public class ScreenShots {
    public static void main (String[] args) throws IOException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");

        //explicit wait
        WebDriverWait stop = new WebDriverWait(driver, Duration.ofSeconds(20));
        stop.until(ExpectedConditions.elementToBeClickable( By.xpath("//*[@id=\'nav-logo-sprites\']")));

        //fluent wait
        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2)).pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        WebElement ScreenImage = fluentWait.until(new Function<WebDriver, WebElement>(){
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//*[@id=\'nav-logo-sprites\']"));
            }
        });

        //Take screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        //convert this ss to file type, also this is the place from where image will be copied.
        File Image = screenshot.getScreenshotAs( OutputType.FILE);
        //Mention the destination where ss should be saved
        File location = new File( "/Users/johragup/Downloads/sample.png");
        //copy paste the file from selenium to local host
        FileHandler.copy(Image, location);

    }}