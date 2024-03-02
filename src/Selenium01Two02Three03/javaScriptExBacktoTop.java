package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExBacktoTop {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.alibaba.com/?xp=0P0JOGOAtOT9LXBpm40zR-ETSr6yLfApJSYcgxiMHk72t68a_gfF4WIaQkxhDRA7gDPeM-WjFfvfqqR18lrAFTiSzY935FXNbLRpWUEEA5s&cps_sk=4li2dtbh&bm=cps&src=saf&gclid=CjwKCAiAuYuvBhApEiwAzq_Yie9SM2oFB2Ed1xPIssd2fXeSnbGO0TEMNqZB9LkVbvRbpxRfjLdQEhoCkrIQAvD_BwE");
        WebElement top=driver.findElement(By.xpath("//i[@class='next-icon next-icon-arrow-up next-medium']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",top);
    }
}
