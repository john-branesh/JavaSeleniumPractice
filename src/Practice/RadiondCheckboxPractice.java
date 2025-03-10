package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class RadiondCheckboxPractice {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/radio");

        //Select any one
        WebElement CheckBox = driver.findElement(By.id("no"));
        CheckBox.click();

        //Cofirm you can select only one radio button
        List<WebElement> OneCheck = driver.findElements(By.name("one"));
        for (WebElement Check: OneCheck){
            Check.click();
            for (WebElement C: OneCheck){
                if (C != Check) {
                    assert !C.isSelected() : "More than one radio button is selected!";

                }
            }

        }
        System.out.println("Test Passed: Only one radio button can be selected at a time.");



    }

}
