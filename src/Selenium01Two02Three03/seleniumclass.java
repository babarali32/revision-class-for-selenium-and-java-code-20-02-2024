package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

    }
}
