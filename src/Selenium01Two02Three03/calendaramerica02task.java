package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class calendaramerica02task {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do?locale=en_US");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement depar = wait.until(ExpectedConditions.elementToBeClickable(By.className("ui-datepicker-trigger")));
        depar.click();

        WebElement nextbutton = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
        WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));

        String forwardMonth = month.getText();
        while (!forwardMonth.contains("June")) {
            nextbutton.click();
            // Re-locate the month element after clicking next
            month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            forwardMonth = month.getText();
        }

        List<WebElement> rows = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));
        for (WebElement it : rows) {
            if (it.getText().equals("22")) {
                it.click();
                break; // Exit the loop once the date is clicked
            }
        }


    }
}
