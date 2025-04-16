package XpathPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v132.indexeddb.model.Key;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SearchInGoogle {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> TableRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));

        for(WebElement Data: TableRows){
            System.out.println(Data.getText()+'|');
        }

    }
}
