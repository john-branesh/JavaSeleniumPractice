package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InputPracitce {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/edit");

        //Enter full name
        WebElement NameBox = driver.findElement(By.id("fullName"));
            NameBox.sendKeys("John Branesh");

        //Append a text and press keyboard tab
        WebElement AppendBox =  driver.findElement(By.id("join"));
            AppendBox.sendKeys("i did it");
            AppendBox.sendKeys(Keys.TAB);

        //Find What is inside the text box
        WebElement GetBox = driver.findElement(By.id("getMe"));
            String Content = GetBox.getText();
            System.out.println(Content);

        //Clear the text inside the box
        WebElement ClearBox = driver.findElement(By.id("clearMe"));
            ClearBox.clear();

        //Check box status
        WebElement BoxStatus = driver.findElement(By.id("noEdit"));
            Boolean Status = BoxStatus.isEnabled();
            if (!Status){
                System.out.println("Box is disabled");
            }
            else {
                System.out.println("Box is enabled");
            }

        //Confirm text is readonly
        WebElement BoxType = driver.findElement(By.id("dontwrite"));
            Boolean Type = BoxType.isEnabled();
            if (Type){
                System.out.println("Box is editable");
            }
            else {
                System.out.println("Box is readonly");
            }



    }
}
