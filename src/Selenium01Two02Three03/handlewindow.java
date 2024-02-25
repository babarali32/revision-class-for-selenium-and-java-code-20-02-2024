package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class handlewindow {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("https://syntaxprojects.com/");
        String mainhandle  =driver.getWindowHandle();
        System.out.println(mainhandle);
        Thread.sleep(4000);
        driver.navigate().refresh();
        WebElement help=driver.findElement(By.xpath("(//span[contains(@style,'padding:')])[1]"));
        help.click();

        Set<String> allhandles=driver.getWindowHandles();
        System.out.println(allhandles.size());
        Iterator<String> handi=allhandles.iterator();
        while (handi.hasNext()) {
            String val = handi.next();
            if (!mainhandle.equals(val)) {
                driver.switchTo().window(val);
                Thread.sleep(4000);
                driver.close();
            }
        }   driver.switchTo().window(mainhandle);



//        mainhandle=handi.next();
//        String childhandle=handi.next();
//        System.out.println(childhandle);
//        Thread.sleep(3000);
//        driver.switchTo().window(mainhandle);

       // driver.close(); // it only will close main page
      //  driver.quit();// it will close all pages




    }
}
