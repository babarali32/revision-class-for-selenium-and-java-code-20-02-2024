package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/handle-iframe.php");

        WebElement frame1=driver.findElement(By.xpath("//iframe[@id='textfieldIframe']"));

        driver.switchTo().frame("textfieldIframe");
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='checkboxIframe']"));
        driver.switchTo().frame("checkboxIframe");
       // driver.switchTo().frame();
        WebElement check=driver.findElement(By.xpath("//input[@value='Option-1']"));
        String val =check.getText();
        System.out.println(val);
        check.click();

//        WebElement box=driver.findElement(By.xpath("//input[@name='Topic']"));
//        box.sendKeys("Hey man i am here ");
    }
}