package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class calendar01 {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement clickbutton = driver.findElement(By.id("btnLogin"));
        clickbutton.click();
        WebElement leave=driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leave.click();
        WebElement calendar=driver.findElement(By.id("calFromDate"));
        calendar.click();
        WebElement selectelement=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(selectelement);
        select.selectByVisibleText("Oct");
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement alldates:dates
             ) {
            if (alldates.getText().equals("21")){
                alldates.click();
                break;
            }
        }
            WebElement secondtable=driver.findElement(By.xpath("//input[@name='leaveList[calToDate]']"));
        secondtable.click();
        WebElement cal=driver.findElement(By.className("ui-datepicker-month"));
        Select selectt=new Select(cal);
        selectt.selectByVisibleText("Dec");
         List<WebElement>  filler=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
         for (WebElement one:filler){
             if (one.getText().equals("10")){
                 one.click();
                 break;

             }         }


    }
}
