package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElement {
    public static  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
       driver=new ChromeDriver();     // it will open the browser , but it will not navigate.
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("lahorepakistan@gmail.com");
        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("!@#barlo304");
        WebElement click=driver.findElement(By.name("login"));
        click.click();
        Thread.sleep(4000);
        driver.findElement(By.partialLinkText("Forgotten")).click();




//        driver.findElement(By.id("email")).sendKeys("babara32@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("pak32");
//        driver.findElement(By.name("login")).click();
//        Thread.sleep(3000);
//       // drive.findElement(By.linkText("Forgotten password?")).click();
//        driver.findElement(By.partialLinkText("password")).click();

    }
}
