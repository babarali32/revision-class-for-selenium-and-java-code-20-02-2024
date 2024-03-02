package Selenium01Two02Three03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class calenderclass02 {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.delta.com/apac/en");
        WebElement button=driver.findElement(By.xpath("//span[@class='calenderDepartSpan']"));
        button.click();
        WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
        WebElement month=driver.findElement(By.className("dl-datepicker-month-0"));
        String textmonth=month.getText();
        while (!textmonth.equals("December")){
            next.click();
            textmonth=month.getText();
        }
        List<WebElement> dates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for (WebElement num:dates){
            String text=num.getText();
            if (text.equals("22")){
                num.click();
                break;
            }
        }
        WebElement returnmotnh=driver.findElement(By.xpath("//span[@class='dl-datepicker-month-1']"));
            String thiss=returnmotnh.getText();
        while (!thiss.equals("February")){
            next.click();
           thiss=returnmotnh.getText();
           // break;
        }
        List<WebElement> once=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for (WebElement dd:once){
            String text3=dd.getText();
            if (text3.equals("22")) {
                dd.click();
                break;
            }
          }
        }
    }
