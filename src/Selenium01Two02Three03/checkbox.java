package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class checkbox {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
           List<WebElement> option=driver.findElements(By.cssSelector("input.cb1-element"));
             Iterator<WebElement>  iterator= option.iterator();
             while (iterator.hasNext()) {
                 WebElement fun = iterator.next();
                 String text=fun.getAttribute("value");
                 System.out.println(text);
                 fun.click();
//                 String val = fun.getAttribute("value");
//                 if (val.equalsIgnoreCase("option-3")) {
//                     fun.click();
                 }
             }
    }