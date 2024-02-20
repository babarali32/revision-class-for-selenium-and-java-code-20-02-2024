package Selenium01Two02Three03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserGetTitleGetURL {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://web.facebook.com/?_rdc=1&_rdr");
        String title=driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();







    }
}
