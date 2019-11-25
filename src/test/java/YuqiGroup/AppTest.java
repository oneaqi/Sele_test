package YuqiGroup;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
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
        assertTrue( true );
    }
}
