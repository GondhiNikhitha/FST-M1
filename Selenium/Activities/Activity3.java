package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //initialize the driver
        WebDriver driver = new FirefoxDriver();
        //open the page
        driver.get("https://training-support.net/selenium/simple-form");
        System.out.println("Title is : "+driver.getTitle());
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("Saahil");
        lastName.sendKeys("Sharma");
        //Enter the email
        driver.findElement(By.id("email")).sendKeys("test@example.com");
        //Enter the contact number
        driver.findElement(By.id("number")).sendKeys("1234567890");
        //Click Submit
        driver.findElement(By.cssSelector(".ui.green.button")).click();
        //Close the browser
        driver.quit();

    }

}

