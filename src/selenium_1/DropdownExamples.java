package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExamples  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/dropdowns");

        //Select the apple using visible text
        WebElement dropdown1 = driver.findElement(By.id("fruits"));
        Select select = new Select(dropdown1);
        select.selectByVisibleText("Apple");
        //select.selectByIndex(2);
        //select.selectByValue("3");
        //dropdown1.sendKeys("Orange");

        List<WebElement> AllOptions = select.getOptions();
        System.out.println(AllOptions);

        //Select your super hero's
        WebElement multiselect = driver.findElement(By.id("superheros"));
        Select multiselect2 = new Select(multiselect);
        multiselect2.selectByIndex(0);
        multiselect2.selectByIndex(1);
        multiselect2.selectByIndex(3);

        //Select the last programming language and print all the options
        WebElement ProgLanguage = driver.findElement(By.id("lang"));
        Select Language = new Select(ProgLanguage);
        Language.selectByVisibleText("C#");
        List<WebElement> AllOptionS = Language.getOptions();
        System.out.println(AllOptionS);







    }
}
