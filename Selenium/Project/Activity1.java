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




    public class Activity1 {
        WebDriver driver;


        @Test
        public void exampleTestCase() {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

            //Open browser
            driver.get("https://alchemy.hguy.co/lms");
            // Check the title of the page
            String title = driver.getTitle();

            //Print the title of the page
            System.out.println("Page title is:" + title);

            //Assertion for page title
           Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
           driver.quit();

        }
}

