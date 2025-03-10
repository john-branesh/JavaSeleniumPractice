package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithButtons {
    public static void main (String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/buttons");

        WebElement LocatePosition = driver.findElement(By.id("position"));
        Point Locator = LocatePosition.getLocation();
        int xValue=Locator.getX();
        int yValue=Locator.getY();
        System.out.println("X is: "+xValue);
        System.out.println("Y is: "+yValue);

        WebElement buttonColor = driver.findElement (By.id("color"));
        String color = buttonColor.getCssValue("background-color");
        System.out.println("Button color is: "+color);

        WebElement ButtonSize = driver.findElement(By.id("property"));
        int height = ButtonSize.getSize().getHeight();
        int width = ButtonSize.getSize().getWidth();
        System.out.println("Height is: "+height);
        System.out.println("Width is: "+width);

         WebElement goHome= driver.findElement(By.id("home"));
         goHome.click();









    }

}
