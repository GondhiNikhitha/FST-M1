package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //initialize the driver
        WebDriver driver = new FirefoxDriver();
        //open the page
        driver.get("https://www.training-support.net/");
        driver.quit();

    }

}

