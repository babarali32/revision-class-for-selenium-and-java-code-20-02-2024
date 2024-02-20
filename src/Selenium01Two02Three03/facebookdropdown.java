package Selenium01Two02Three03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class facebookdropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        WebElement date=driver.findElement(By.id("day"));
        Select select=new Select(date);
        select.isMultiple();
        List<WebElement> dates  =select.getOptions();
        int size=dates.size();
        System.out.println(size);
        if(select.getOptions().size()==31){
            System.out.println("days are 31 in one month");
        }else {
            System.out.println("days are not 31 , wrong entry");
        }

    }
}
