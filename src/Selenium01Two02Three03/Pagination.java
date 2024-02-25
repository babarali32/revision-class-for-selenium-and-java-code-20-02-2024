package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Pagination {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-pagination-demo.php#");

        boolean flag = true;
        while (flag) {
            List<WebElement> elementList = driver.findElements(By.xpath("//table[@class='table table-hover']/tbody/tr"));
            for (WebElement tablerows : elementList) {
                String rowtext = tablerows.getText();
                if (rowtext.contains("Brad Jill")) {
                    System.out.println(rowtext);
                    flag=false;
                    break;
                }
            }
            WebElement button = driver.findElement(By.xpath("//a[@class='next_link']"));
            button.click();
            // Introduce a delay to ensure the page loads completely before finding elements again
            Thread.sleep(2000); // Adjust delay as needed
        }
        driver.close();
    }
}
