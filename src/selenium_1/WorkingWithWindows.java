package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class WorkingWithWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/windows");

        String parentWindow = driver.getWindowHandle();

        //go home new tab
        WebElement home = driver.findElement(By.id("home"));
        home.click();

        Set<String> AllTabs = driver.getWindowHandles();

        for (String childTab : AllTabs) {
            if (!childTab.equals(parentWindow)) {
                driver.switchTo().window(childTab);
                break;
            }
        }
        Thread.sleep(5000);
        WebElement NewTabEdit = driver.findElement (By.xpath(
                "/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer"));
        NewTabEdit.click();
        driver.close();
        driver.switchTo().window(parentWindow);


        //select multi tab
        WebElement multiTab = driver.findElement(By.id("multi"));
        multiTab.click();

        Thread.sleep(3000);

        //find number of tabs opened
        int NumberOfTabsOpened = driver.getWindowHandles().size();
        System.out.println("Number of tabs opened: " + NumberOfTabsOpened);

        Thread.sleep(3000);

        //close all tabs except parent
        WebElement closeAllTabs = driver.findElement(By.id("multi"));
        closeAllTabs.click();

        Thread.sleep(3000);

        //get the opened tab details
        Set<String> allTabs = driver.getWindowHandles();
        //close tabs except default tab
        for (String childTab : allTabs){
            if (!childTab.equals(parentWindow)) {
                driver.switchTo().window(childTab);
                driver.close();
            }
        }


    }
}
