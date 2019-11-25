package YuqiGroup;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        String pathToFirefoxDriver = "/usr/local/bin/geckodriver";
        System.setProperty("webdriver.firefox.marionette", pathToFirefoxDriver);
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        String innerText = driver.findElement(By
                .xpath("//table/tbody/tr/td[2]"
                        + "//table/tbody/tr[4]/td/"
                        + "table/tbody/tr/td[2]/"
                        + "table/tbody/tr[2]/td[1]/"
                        + "table[2]/tbody/tr[3]/td[2]/font"))
                .getText();

        System.out.println(innerText);
       // driver.quit();
        System.out.println( "Hello World!" );
    }
}
