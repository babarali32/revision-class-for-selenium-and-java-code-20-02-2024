package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class amazdropdown {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.cssSelector("select[name='_sacat']"));
        Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        for (WebElement all:options
             ) {
            String print =all.getText();
            System.out.println(print);

        }
        select.selectByValue("2984");


    }
}