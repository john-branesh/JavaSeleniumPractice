package selenium_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonExaple {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/radio");

        //select any one
        WebElement SelectAny =  driver.findElement(By.id("no"));
        SelectAny.click();

        //confirm only one button can be selected
        WebElement SelectOnlyOne = driver.findElement(By.id("one"));
        boolean enabled = SelectOnlyOne.isEnabled();
        System.out.println("one option can be selected ate a time " + enabled);

        //find the bug
        WebElement FindBug = driver.findElement(By.id("bug"));
        FindBug.click();
        boolean bug = FindBug.isSelected();
        System.out.println("one option can be selected ate a time " + bug);
        WebElement FindBug2 = driver.findElement(By.id("nobug"));
        FindBug2.click();
        boolean bug2 = FindBug2.isSelected();
        System.out.println("one option can be selected ate a time " + bug2);
        if (bug && bug2)
            {
                System.out.println("both radio buttons can be selected it is a bug");}
                else
                {
                    System.out.println("only one radio button can be selected it is not a bug");
                }

        // Find which one is selected
        WebElement FindSelected = driver.findElement(By.id("foo"));
        FindSelected.click();
        boolean selected = FindSelected.isSelected();
        WebElement FindSelected1 = driver.findElement(By.id("notfoo"));
        boolean selected2 = FindSelected.isSelected();
        if (selected == true){
            System.out.println("foo is selected");}
        else if (selected2 == true) {
            System.out.println("notfoo is selected");}
        else {
            System.out.println("none is selected");}
        }







    }




