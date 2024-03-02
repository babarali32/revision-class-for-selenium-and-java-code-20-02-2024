package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiondragganddrop {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        WebElement drager=driver.findElement(By.id("draggable"));

        WebElement dropingplace=driver.findElement(By.id("droppable"));

        Actions object=new Actions(driver);
        //object.dragAndDrop(drager,dropingplace).perform();
        object.clickAndHold(drager).moveToElement(dropingplace).release().build().perform();

    }
}
