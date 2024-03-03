package Selenium01Two02Three03;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshots {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

      driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("Tester", Keys.TAB);

      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Btest",Keys.ENTER);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File photo  =ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(photo,new File("screenshot/smartbear/admin.png"));

//
//      WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
//      login.click();


















    }
}
