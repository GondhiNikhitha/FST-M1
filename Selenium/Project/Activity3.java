package Activities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;




public class Activity3  {
    WebDriver driver;


    @Test
    public void exampleTestCase() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();


        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
        Thread.sleep(2000);

        String heading = driver.findElement(By.xpath("//h3[@class='uagb-ifb-title']")).getText();
        //Print the title of the page
        System.out.println("Page heading is:" + heading);

        Assert.assertEquals(heading, "Actionable Training");


        driver.quit();

    }
}

