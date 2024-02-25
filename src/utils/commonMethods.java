package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonMethods {
    public static WebDriver driver;
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("");
    }
    public void closeBrowser(){
        if(driver!=null){
            driver.close();
        }
    }
}
