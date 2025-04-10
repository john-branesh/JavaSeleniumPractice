package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class HyperlinkExample {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johnbranesh/Programming/Artifacts/" +
                "WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://leafground.com/link.xhtml");

        //Pressing 1st link
        WebElement dashboardLink = driver.findElement(By.linkText("Go to Dashboard"));
        dashboardLink.click();
        driver.navigate().back();

        //find url without clicking me
        WebElement UrlDestination = driver.findElement(By.partialLinkText("Find the URL without"));
        String url = UrlDestination.getDomAttribute("href");
        System.out.println("the url is: "+ url);

        //find broken link
        WebElement BrokenLink = driver.findElement(By.linkText("Broken?"));
        BrokenLink.click();
        String PageTitle = driver.getTitle();
        if (PageTitle.contains("404")){
            System.out.println("Link is broken");
        }
        else {
            System.out.println("Link not broken");
        }
        driver.navigate().back();

        //is it duplicate link?
        WebElement dashboardLink2 = driver.findElement(By.linkText("Go to Dashboard"));
        dashboardLink2.click();
        System.out.println("duplicate link pressed");
        driver.navigate().back();

        //count links under page
        List<WebElement> Links = driver.findElements(By.xpath("//form[@id='j_idt87']//a"));
        int NubmerofLinks = Links.size();
        System.out.println("total no of links are: "+ NubmerofLinks);

        //count links under layout
        List <WebElement> LayoutLinks = driver.findElements(By.xpath
                ("//body[@class='main-body ui-input-filled']//a"));
        int layouttotallinks = LayoutLinks.size();
        System.out.println("Total links in page: "+ layouttotallinks);

        driver.quit();
        }

}
