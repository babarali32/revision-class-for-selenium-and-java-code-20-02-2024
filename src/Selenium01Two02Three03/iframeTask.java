package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeTask {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        WebElement oneframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(oneframe);
        WebElement textinsideframe=driver.findElement(By.id("sampleHeading"));
           String val=textinsideframe.getText();
        System.out.println(val);

    }
}
