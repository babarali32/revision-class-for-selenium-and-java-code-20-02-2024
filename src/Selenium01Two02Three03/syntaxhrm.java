package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class syntaxhrm {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input.button")).click();
        WebElement mssge=driver.findElement(By.cssSelector("span[id='spanMessage']"));
        System.out.println("this is the text "+ mssge.getText());
        boolean display=mssge.isDisplayed();
        System.out.println("message is displaying yes "+ display);


    }
}
