package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactName {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        //Get the contact name of the company 'Island Trading'.
        String ContactName = driver.findElement(By.xpath("//table[@id='customers']//tr[td[1][contains(text(), 'Island Trading')]]/td[2]")).getText();
        System.out.println(ContactName);
    }
}
