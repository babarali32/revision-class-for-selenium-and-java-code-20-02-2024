package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement button=driver.findElement(By.cssSelector("input[value*='5 - 15']"));
        boolean isslected=button.isSelected();
        System.out.println( isslected);
        button.click();
        isslected=button.isSelected();
        System.out.println(isslected);




    }
}