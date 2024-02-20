package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipledropdonw {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");
        WebElement element=driver.findElement(By.id("multi-select"));
        Select select=new Select(element);
        boolean multiple=select.isMultiple();
        System.out.println(multiple);
        if(multiple){
        List<WebElement> all=select.getOptions();
        for (WebElement once:all) {
            String num=once.getText();
            select.selectByValue(num);
            //if(num.equalsIgnoreCase("Texas")){
            System.out.println(num);
            select.selectByValue(num);
            Thread.sleep(3000);
             }
       // select.deselectByIndex(4);
            select.deselectAll();
           }
        }
    }

