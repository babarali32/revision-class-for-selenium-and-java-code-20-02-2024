package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ebay {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        List<WebElement> list=driver.findElements(By.tagName("a"));
        System.out.println(list.size());

                Iterator<WebElement> iterator =list.iterator();
                while (iterator.hasNext()){
                    WebElement element=iterator.next();
                    String link=element.getText();
                   String values= element.getAttribute("href");
                    if(!link.isEmpty()) {
                        System.out.println(link+" ---- "+values);
                    }
                }

    }

}
