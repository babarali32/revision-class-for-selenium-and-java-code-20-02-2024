package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tableweborder {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement user = driver.findElement(By.id("ctl00_MainContent_username"));
        user.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("Btest");
        WebElement button = driver.findElement(By.id("ctl00_MainContent_login_button"));
        button.click();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        System.out.println(rows.size());
        for (int i = 1; i < rows.size(); i++) {
            WebElement one=rows.get(i);
            String print=one.getText();
            System.out.println(print);
            if(print.contains("FamilyAlbum")){
                List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click();
            }
        }

    }
}