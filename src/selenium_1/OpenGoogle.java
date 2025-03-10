package selenium_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogle {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // 1. open chrome or firefox browser
        // 2. search google.com

        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.co.in");
        driver.quit();

    }
}
