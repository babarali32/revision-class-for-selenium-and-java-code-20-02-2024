package Selenium01Two02Three03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tableTask {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement add=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        add.click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        WebElement msge=driver.findElement(By.id("message"));
        boolean displ=msge.isDisplayed();
        System.out.println(displ);
        WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
        textbox.sendKeys("Hello world");
        add.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
//        displ=msge.isDisplayed();
        System.out.println(displ);

    }
}