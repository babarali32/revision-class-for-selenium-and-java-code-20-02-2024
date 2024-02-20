package Selenium01Two02Three03;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdownVerification {
    public static void main(String[] args) {
        // Setting system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        // Creating a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Facebook
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        // Locate month dropdown
        WebElement monthDropdown = driver.findElement(By.id("month"));
        Select monthSelect = new Select(monthDropdown);

        // Verify month dropdown has 12 options
        if (monthSelect.getOptions().size() == 12) {
            System.out.println("Month dropdown has 12 options.");
        } else {
            System.out.println("Month dropdown does not have 12 options.");
        }

        // Locate day dropdown
        WebElement dayDropdown = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDropdown);

        // Verify day dropdown has 31 options
        if (daySelect.getOptions().size() == 31) {
            System.out.println("Day dropdown has 31 options.");
        } else {
            System.out.println("Day dropdown does not have 31 options.");
        }

        // Locate year dropdown
        WebElement yearDropdown = driver.findElement(By.id("year"));
        Select yearSelect = new Select(yearDropdown);

        // Verify year dropdown has 115 options
        if (yearSelect.getOptions().size() == 115) {
            System.out.println("Year dropdown has 115 options.");
        } else {
            System.out.println("Year dropdown does not have 115 options.");
        }

        // Selecting date of birth (for demonstration, let's select random values)
        monthSelect.selectByVisibleText("Feb");
        daySelect.selectByVisibleText("15");
        yearSelect.selectByVisibleText("1990");

        // Sleep for a while to observe the selected values
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}


