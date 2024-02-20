package git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitclass {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/bootstrap-iframe.php");
        driver.switchTo().frame("FrameOne");
        WebElement button = driver.findElement(By.xpath("//img[@class='image-104'][1]"));
        button.click();

       }
    }

