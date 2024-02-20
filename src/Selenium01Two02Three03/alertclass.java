package Selenium01Two02Three03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertclass {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement simple=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simple.click();
        Alert simplealert=driver.switchTo().alert();
        Thread.sleep(4000);
        String message =simplealert.getText();
        simplealert.accept();
        System.out.println(message);
        WebElement confrimation=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confrimation.click();
              Alert confirm=driver.switchTo().alert();
              String val=confirm.getText();
              confirm.dismiss();
        System.out.println(val);
        WebElement prompt=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        prompt.click();
        Alert pro=driver.switchTo().alert();
        pro.sendKeys("hey how are you");
        String num=pro.getText();
        System.out.println(num);
        pro.accept();


    }
}