package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03FbAccount {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver drive=new ChromeDriver();
        drive.navigate().to("https://web.facebook.com/?_rdc=1&_rdr");
        Thread.sleep(4000);
        drive.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(4000);
        WebElement firtname=drive.findElement(By.xpath("//input[@name='firstname']"));
        firtname.sendKeys("firstname");
        WebElement sirname=drive.findElement(By.xpath("//input[@name='lastname']"));
        sirname.sendKeys("sername");
        WebElement email1=drive.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
        email1.sendKeys("abc@gmail.com");
        WebElement email=drive.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]"));
        email.sendKeys("abc@gmail.com");
        WebElement password=drive.findElement(By.xpath("//input[@autocomplete='new-password']"));
        password.sendKeys("PakistaN32");





    }
}
