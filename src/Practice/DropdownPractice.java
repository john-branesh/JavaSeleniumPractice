package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownPractice {
    public static void main (String[] args){
        System.setProperty("webdriver.gecko.driver", "/Users/johragup/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://letcode.in/dropdowns");

    //Select the apple using visible text
    WebElement Fruits = driver.findElement(By.id("fruits"));
        Select frit =new Select(Fruits);
        frit.selectByVisibleText("Apple");

    //Select your superhero's
    WebElement SuperHeros = driver.findElement(By.id("superheros"));
        Select heros = new Select (SuperHeros);
        heros.selectByValue("am");
        heros.selectByValue("ds");
        heros.selectByValue("th");
        heros.selectByValue("wv");

    //Select the last programming language and print all the options
    WebElement Languages = driver.findElement(By.id("lang"));
        Select language = new Select (Languages);
        language.selectByValue("sharp");

        List<WebElement> ProgLang = language.getOptions();
            System.out.println("ProgLang are: ");
            for (WebElement option : ProgLang) {
                System.out.println(option.getText());
            }

    //Select India using value & print the selected value
    WebElement Country = driver.findElement(By.id("country"));
        Select india = new Select(Country);
        india.selectByValue("India");
        String SelectedCountry = india.getFirstSelectedOption().getText();
        System.out.println(SelectedCountry);

    }
}
