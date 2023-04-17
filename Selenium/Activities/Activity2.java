package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args)
    {
        //setup the driver
        WebDriverManager.firefoxdriver().setup();
        //initialize the driver
        WebDriver driver = new FirefoxDriver();
        //open the page
        driver.get("https://www.training-support.net/");
        String title=driver.getTitle();
        System.out.println(title);

        WebElement id= driver.findElement(By.id("about-link"));
        System.out.println("using id " + id.getText());
        WebElement className=driver.findElement(By.className("green"));
        System.out.println("using classname " + className.getText());
        WebElement linkText= driver.findElement(By.linkText("About Us"));
        System.out.println("using linkText " + linkText.getText());
        WebElement cssSelector=driver.findElement(By.cssSelector(".ui.inverted.green.button"));
        System.out.println("using cssSelector " + cssSelector.getText());
        driver.quit();

    }
}

