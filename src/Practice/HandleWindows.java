package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleWindows {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://freecrm.com/en");

        //get signup button
        WebElement SignUp = driver.findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-contained " +
                "MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-colorPrimary MuiButton-root " +
                "MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge " +
                "MuiButton-colorPrimary mui-1cxo7uq' and contains(text(),'Sign Up')]\n"));
        SignUp.click();

        Set<String> tabs = driver.getWindowHandles();
        List<String> ListofTabs = new ArrayList<>(tabs);


        driver.switchTo().window(ListofTabs.get(1));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("Cogmento CRM"));
        System.out.println("switched to new tab: "+ driver.getTitle());

        driver.switchTo().window(ListofTabs.get(0));
        System.out.println("switched back to default tab");




    }
}
