package Selenium01Two02Three03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class tablesss {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/table-search-filter-demo.php");

        List<WebElement> table=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(table.size());
        Iterator<WebElement> elementIterator=table.iterator();
        while (elementIterator.hasNext()){
             WebElement rows =elementIterator.next();
             String text=rows.getText();
            System.out.println(text);
        }
        System.out.println("----------------");
        List<WebElement> heading=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(heading.size());
        for (WebElement column:heading
             ) {
            String colmntext=column.getText();
            System.out.println(colmntext);
        }
    }
}
