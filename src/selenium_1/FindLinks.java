package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FindLinks {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        try(FileWriter writer = new FileWriter("links_seen.json")){
            driver.get("https://www.w3schools.com/html/html_tables.asp");
            List<WebElement> AllLinks = driver.findElements(By.tagName("a"));

            writer.write("Number of links available are "+ AllLinks.size()+"\n\n");

            System.out.println("Number of links available are "+ AllLinks.size());

            for(WebElement LinkText : AllLinks) {
                String linktext = LinkText.getText();
                String linkhref = LinkText.getDomAttribute("href");

                writer.write("link text: "+ linktext+"\n");
                writer.write("Link url: "+ linkhref+"\n");

//            System.out.println(LinkText.getText());
        }
            System.out.println("Links written to links_output.txt successfully!");
    }
        catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            driver.quit();
        }
        }

}
