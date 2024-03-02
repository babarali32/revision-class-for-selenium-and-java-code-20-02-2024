package Selenium01Two02Three03;

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class FlightSearch {

        public static void main(String[] args) {
            // Set the path to the chromedriver executable
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

            // Initialize ChromeDriver
            WebDriver driver = new ChromeDriver();

            // Implicit wait for 10 seconds
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            try {
                // Navigate to aa.com homepage
                driver.get("https://www.aa.com/homePage.do");

                // Select depart date
                WebElement departDateField = driver.findElement(By.id("departDate"));
                departDateField.sendKeys("03/10/2024");

                // Select return date
                WebElement returnDateField = driver.findElement(By.id("returnDate"));
                returnDateField.sendKeys("03/15/2024");

                // Select destination
                WebElement destinationField = driver.findElement(By.id("destination"));
                destinationField.sendKeys("New York");

                // Click on search
                WebElement searchButton = driver.findElement(By.id("searchButton"));
                searchButton.click();

                // Wait for search results to load (you might need to implement this part depending on the website behavior)

                // Quit the browser
                driver.quit();
            } catch (Exception e) {
                e.printStackTrace();
              //  driver.quit();
            }
        }
    }

