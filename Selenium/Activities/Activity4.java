package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //initialize the driver
        WebDriver driver = new FirefoxDriver();
        //open the page
        driver.get("https://www.training-support.net");
        System.out.println("Title is : "+driver.getTitle());
       driver.findElement(By.xpath("/html/body/div/div/div/a")).click();
        System.out.println("New Title is : "+driver.getTitle());
        //Close the browser
        driver.quit();

    }

}

