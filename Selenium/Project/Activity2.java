package Activities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Activity2{
    WebDriver driver;


    @Test
    public void exampleTestCase() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
        // Check the heading of the page
        String heading = driver.findElement(By.tagName("h1")).getText();

        //Print the heading of the page
        System.out.println("Page heading is:" + heading);

        //Assertion for page heading
        Assert.assertEquals(heading,"Learn from Industry Experts");
        driver.quit();

    }
}

