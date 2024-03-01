package Selenium01Two02Three03;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class PaginationExample {

    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        login();
        addEmployee();
        deleteEmployee();

        driver.quit();
    }

    public static void login() {
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement clickbutton = driver.findElement(By.id("btnLogin"));
        clickbutton.click();
    }

    public static void addEmployee() {
        WebElement pim = driver.findElement(By.id("menu_pim_viewPimModule"));
        pim.click();
        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Doe");
        WebElement idNumber = driver.findElement(By.id("employeeId"));
        String employeeId = idNumber.getAttribute("value");
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
    }
    public static void deleteEmployee() {
        WebElement employeeList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeList.click();
        boolean flag = true;
        while (flag) {
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < rows.size(); i++) {
                WebElement employeeRow = rows.get(i);
                String rowText = employeeRow.getText();
                if (rowText.contains("John Doe")) { // Modify this condition according to your scenario
                    flag = false;
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkbox.click();
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    Alert alert = driver.switchTo().alert();
                    alert.accept();
                    break;
                }
            }
            if (flag) {
                WebElement nextPageButton = driver.findElement(By.linkText("Next"));
                nextPageButton.click();
            }
        }
    }
}
