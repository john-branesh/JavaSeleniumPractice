package selenium_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEExample {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/alert");

        //simple alert
        WebElement SimpleAlert = driver.findElement(By.id("accept"));
        SimpleAlert.click();
        Alert simplepopupAlert = driver.switchTo().alert();
        simplepopupAlert.accept();

        //confirm alert
        WebElement ConfirmAlert = driver.findElement(By.id("confirm"));
        ConfirmAlert.click();
        Alert dismissAlert = driver.switchTo().alert();
        dismissAlert.dismiss();

        //type name and accept
        WebElement InputAlert = driver.findElement(By.id("prompt"));
        InputAlert.click();
        Alert namealert = driver.switchTo().alert();
        namealert.sendKeys("John Branesh R");
        namealert.accept();

        //





    }

}
