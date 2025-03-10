package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExamples {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get(" dropable");

        //drag the element
        WebElement DragElement = driver.findElement(By.id("draggable"));
        WebElement DropLocation = driver.findElement(By.id("droppable"));

        Actions dragdrop = new Actions(driver);
        dragdrop.clickAndHold(DragElement).moveToElement(DropLocation).release(DropLocation).build().perform();  

    }
}
