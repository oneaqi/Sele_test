import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestClass{
    private WebDriver driver, driver2;
    private WebDriverWait myWaitVar;
    @Before

    public void setup(){

        String pathToChromeDriver = "C:\\Selenium\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        myWaitVar = new WebDriverWait(driver,10);



    }

    @After
    public void teardown() {

        //driver.close();
    }

    @Test
    public void loginTest () throws InterruptedException {

        driver.navigate().to("http://192.168.56.103:8080");

        WebElement username = driver.findElement(By.id("j_username"));

        username.sendKeys("wrongName");
        username.clear();
        username.sendKeys("yzhang");

        driver.findElement(By.name("j_password")).sendKeys("Notim@1234");
        Thread.sleep(5000);
        WebElement toSubmit = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.className("submit")));
        toSubmit.click();

        String tagName = "";
        tagName = driver.findElement(By.id("job_SimpleJob")).getTagName();
        System.out.println(tagName);

        driver.findElement(By.linkText("Manage Jenkins")).click();



    }


}
