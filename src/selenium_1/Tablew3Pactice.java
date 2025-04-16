package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Tablew3Pactice {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> countrydata = driver.findElements(By.xpath("//table[@id='customers']//td[3]"));

        for (WebElement Countries : countrydata){
            System.out.println("Countries in Table are: "+ Countries.getText());
        }

    }
}
