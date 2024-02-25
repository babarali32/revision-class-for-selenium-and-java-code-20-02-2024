package Selenium01Two02Three03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class handleSyntax {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/window-popup-modal-demo.php");
        String mainHandle=driver.getWindowHandle();
        System.out.println(mainHandle);
        driver.manage().window().maximize();
        WebElement instagram=driver.findElement(By.xpath("//a[text()=' Follow On Instagram ']"));
        WebElement facebook=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement both=driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instagram.click();
        facebook.click();
        both.click();
        Set<String> all=driver.getWindowHandles();
        System.out.println(all.size());
        Iterator<String> it=all.iterator();
        while (it.hasNext()){
            String sum=it.next();  // window handles
            System.out.println(sum);
            if(!mainHandle.equals(sum)){
            driver.switchTo().window(sum);
                String title=driver.getTitle();
                System.out.println(title);
            driver.close();
          }
        }
        driver.switchTo().window(mainHandle);
        facebook.click();






    }
}