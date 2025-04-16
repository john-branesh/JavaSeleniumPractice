package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowPractice1 {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/window");

        WebElement WindowButt = driver.findElement(By.id("home"));
        WindowButt.click();

        List<String> Windows = new ArrayList<>(driver.getWindowHandles());

    }
}
