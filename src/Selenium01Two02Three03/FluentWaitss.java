package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitss {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/synchronization-waits.php");

                FluentWait wait = new FluentWait(driver);
                wait.withTimeout(Duration.ofSeconds(30));
                wait.pollingEvery(Duration.ofSeconds(8));

              WebElement button=driver.findElement(By.id("show_text_synchronize_02"));
              button.click();




    }
}