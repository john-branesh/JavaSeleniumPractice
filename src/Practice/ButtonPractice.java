package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonPractice {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/button");

        //Goto Home and come back here using driver commandol
        WebElement HomeButton = driver.findElement(By.id("home"));
            HomeButton.click();
            driver.navigate().back();

        //Get the X & Y co-ordinates
        WebElement LocatButton = driver.findElement(By.id("position"));
            Point CoOrdinates = LocatButton.getLocation();
            System.out.println("location is "+ CoOrdinates);

        //Find the color of the button
        WebElement ButtonColour = driver.findElement(By.id("color"));
            String Colour = ButtonColour.getCssValue("background-color");
            System.out.println("Colour is "+Colour);

        //Find the height & width of the button
        WebElement ButtonDimension = driver.findElement(By.id("property"));
            Dimension HeightandWidth = ButtonDimension.getSize();
            System.out.println("Height & Width of button is "+ HeightandWidth);

        //Confirm button is disabled
        WebElement ButtonStatus = driver.findElement(By.id("isDisabled"));
            Boolean Status = ButtonStatus.isEnabled();
                if (Status){
                    System.out.println("Button is Enabled");
                }
                else {
                    System.out.println("Button is Disabled");
                }

        //Click and Hold Button
        WebElement ClickandHold = driver.findElement(By.xpath ("/html/body/app-root/app-buttons/section/div/div/div[1]/div/div/div[6]/div/button/div/h2"));
            Actions clicknhold = new Actions(driver);
            clicknhold.clickAndHold(ClickandHold).build().perform();





    }
}
