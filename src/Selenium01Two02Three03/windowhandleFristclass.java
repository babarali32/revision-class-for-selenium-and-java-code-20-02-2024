package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowhandleFristclass {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://accounts.google.com/lifecycle/steps/signup/name?dsh=S721726040:1708507375506217&flowEntry=SignUp&flowName=GlifWebSignIn&theme=glif&TL=ADg0xR1LSIWGFSeh28yXPj75q3-BWBbxz_Endygch-iBMWH74jGGDJMksWalExfM");
        String handless  =driver.getWindowHandle();
        System.out.println(handless);
        WebElement help=driver.findElement(By.linkText("Help"));
        help.click();
        Set<String> allhandles=driver.getWindowHandles();
        System.out.println(allhandles.size());
        Iterator<String>  handi=allhandles.iterator();

    }
}
