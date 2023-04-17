package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity11_2{
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //Click the button to open a simple alert
        driver.findElement(By.cssSelector("button#confirm")).click();

        //Switch to alert window
        Alert confirmAlert = driver.switchTo().alert();

        //Get text in the alert box and print it
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);

        //Close the alert with OK
        confirmAlert.accept();

        //Close the browser with Cancel
        //confirmAlert.dismiss();

        //Close the Browser
        driver.close();
    }
}
