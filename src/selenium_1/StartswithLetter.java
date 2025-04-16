package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartswithLetter {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        //Find the row where the company name starts with 'M'.
        WebElement row = driver.findElement(By.xpath("//table[@id='customers']//tr[td[1][starts-with(text(), 'M')]]"));
        String name = row.getText();
        System.out.println(name);

    }
}
