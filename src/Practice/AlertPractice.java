package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPractice {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/alert");

    //Accept the Alert
        WebElement SimpleAlert = driver.findElement(By.id("accept"));
        SimpleAlert.click();
        Alert Salert = driver.switchTo().alert();
        Salert.accept();

    //Dismiss the Alert & print the alert text
    WebElement InteractAlert = driver.findElement(By.id("confirm"));
    InteractAlert.click();
        Alert IAlert = driver.switchTo().alert();
        String TextContent = IAlert.getText();
        System.out.println(" Alert text was: "+TextContent);
        IAlert.accept();

    //Type your name & accept
    WebElement PromptAlert = driver.findElement(By.id("prompt"));
    PromptAlert.click();
        Alert PAlert = driver.switchTo().alert();
        PAlert.sendKeys("John Branesh");
        PAlert.accept();

    //Sweet alert
    WebElement ModernAlert = driver.findElement(By.id("modern"));
    ModernAlert.click();
    WebElement SweetAlert = driver.findElement(By.xpath("/html/body/app-root/app-alert/section/div/div/div[1]/div/div/div[5]/button"));
    SweetAlert.click();


    }
}
