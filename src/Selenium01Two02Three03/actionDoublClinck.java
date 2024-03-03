package Selenium01Two02Three03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDoublClinck {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightclick).perform();
        WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
        actions.click(edit).build().perform();
        Alert aalrt=driver.switchTo().alert();
        aalrt.accept();
        WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        actions.doubleClick(doubleclick).build().perform();
        Alert secondalert=driver.switchTo().alert();
        secondalert.accept();
    }
}