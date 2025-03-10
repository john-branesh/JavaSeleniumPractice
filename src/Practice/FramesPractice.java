package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesPractice {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/frame");

    //Switch to first frame
        driver.switchTo().frame("firstFr");
    //Enter first name
        WebElement FirstName = driver.findElement(By.name("fname"));
        FirstName.sendKeys("John Branesh");
    //Second name
        WebElement SecondName = driver.findElement(By.name("lname"));
        SecondName.sendKeys("Ragupathi");


        //Switching to nested frame, since no id available using xpath
        driver.switchTo().frame(driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div[2]/iframe")));

        //Enter email
        WebElement email = driver.findElement(By.xpath("/html/body/app-root/app-innerframe/div/div/div/div/div/input"));
        email.sendKeys("jvjwnsvihb@gmail.com");

        driver.switchTo().defaultContent();


    }
}
