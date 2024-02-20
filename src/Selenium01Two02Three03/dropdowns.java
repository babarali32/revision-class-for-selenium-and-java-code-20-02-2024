package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdowns {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
           WebElement element=driver.findElement(By.id("select-demo"));
        Select select=new Select(element);
        select.selectByIndex(3);
        Thread.sleep(3000);
        select.selectByVisibleText("Friday");
        Thread.sleep(3000);
        select.selectByValue("Wednesday");

           List<WebElement> alloption =select.getOptions();
           int size=alloption.size();
        System.out.println(alloption.size());
           for (int i=0; i<size; i++){

                 String once =alloption.get(i).getText();
                select.selectByIndex(i);

               System.out.println(once);

           }



    }
}