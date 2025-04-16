package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class NotCountry {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> CompanyName = driver.findElements(By.xpath("//table[@id='customers']//tr[td[3] and not (td[3]='UK')]/td[1]"));

        System.out.println("Companies where country is NOT UK:");
        for (WebElement company : CompanyName) {
            System.out.println(company.getText());
        }
    }
}
