package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import java.util.ArrayList;

import java.awt.*;
import java.util.ArrayList;

public class WindowPractice {
    public static void main (String [] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/window");

        //Parent window
        String DefaultWindow = driver.getWindowHandle();
        System.out.println("Default Window handle is: "+ DefaultWindow);

        //Click on the home button
        WebElement HomeButton = driver.findElement(By.id("home"));
        HomeButton.click();
        System.out.println("Home button is clicked");

        //get all window handles
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        System.out.println("open windowlist are:" + windowList);

        // Switch to the newly opened tab
        if (windowList.size()>1){
            driver.switchTo().window(windowList.get(1));
            Thread.sleep(2000);
            System.out.println("New tab Title is: " + driver.getTitle());
        } else {
            System.out.println("No new tab was opened!");
        }

        //close the parent window
        driver.switchTo().window(DefaultWindow);
        driver.close();

        //close the Child window
        driver.switchTo().window(windowList.get(1));
        driver.close();

        //Open website again to click "Multiple Windows" button
        driver = new FirefoxDriver();
        driver.get("https://letcode.in/window");

        //click muliple tab button
        WebElement multipleTabButton = driver.findElement(By.id("multi"));
        multipleTabButton.click();

        //Get all window handles for multiple tabs
        List<String> secondWindowList = new ArrayList<>(driver.getWindowHandles());

        //Print all window titles
        System.out.println("Opened Windows Titles:");
        for (String handle : secondWindowList) {
            driver.switchTo().window(handle);
            Thread.sleep(4000);
            System.out.println(driver.getTitle());
        }

        //Close all windows
        driver.quit();
        System.out.println("All windows closed!");

    }
}
