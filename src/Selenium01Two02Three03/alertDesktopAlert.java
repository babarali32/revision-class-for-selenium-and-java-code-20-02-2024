package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDesktopAlert {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement upload=driver.findElement(By.linkText("File Upload"));
        upload.click();
        WebElement choose=driver.findElement(By.xpath("//input[@id='file-upload']"));
        choose.sendKeys("C:\\Users\\FM SIFT\\OneDrive\\Desktop\\abc.jpeg");

    }
}
