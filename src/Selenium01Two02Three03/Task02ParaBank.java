package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02ParaBank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm");
        driver.findElement(By.name("customer.firstName")).sendKeys("twa");
        Thread.sleep(4000);
        driver.findElement(By.className("input")).sendKeys("twi");
        Thread.sleep(4000);
        driver.findElement(By.name("customer.address.street")).sendKeys("lahore pakistan");
        Thread.sleep(4000);
        driver.findElement(By.id("customer.address.city")).sendKeys("india");
        Thread.sleep(4000);
        driver.findElement(By.name("customer.address.state")).sendKeys("para");
        Thread.sleep(4000);
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("2901");
        Thread.sleep(4000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("483434344");
        Thread.sleep(4000);
        driver.findElement(By.id("customer.ssn")).sendKeys("43f34f");
        Thread.sleep(4000);
        driver.findElement(By.name("customer.username")).sendKeys("babar123");
        Thread.sleep(4000);
        driver.findElement(By.name("customer.password")).sendKeys("123pakisrub");
        Thread.sleep(4000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("123pakisrub");
        Thread.sleep(4000);
        driver.findElement(By.className("button")).click();


//
//
//        Thread.sleep(4000);
//        driver.findElement(By.linkText("Register")).click();
//        Thread.sleep(4000);
//        driver.findElement(By.id("customer.firstName")).sendKeys("ABC");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.lastName")).sendKeys("XYZ");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.address.street")).sendKeys("street 24, Lahore-pakistan");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.address.city")).sendKeys("Lahore");
//        Thread.sleep(4000);
//        driver.findElement(By.id("customer.address.state")).sendKeys("punjab");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.address.zipCode")).sendKeys("5400");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.phoneNumber")).sendKeys("123");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.ssn")).sendKeys("101");
//        Thread.sleep(4000);
//        driver.findElement(By.name("customer.username")).sendKeys("donaldTrump");
//        Thread.sleep(4000);
//        driver.findElement(By.id("customer.password")).sendKeys("pass");
//        Thread.sleep(4000);
//        driver.findElement(By.id("repeatedPassword")).sendKeys("pass");
//        Thread.sleep(4000);
//        driver.findElement(By.className("button")).click();
//        Thread.sleep(4000);
//        driver.close();

    }
}
