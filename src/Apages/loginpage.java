package Apages;

import Dutils.commonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class loginpage  extends commonMethods {
       public WebElement username = driver.findElement(By.id("txtUsername"));
       public WebElement password = driver.findElement(By.id("txtPassword"));
       public WebElement clickbutton = driver.findElement(By.id("btnLogin"));
        public String val;
}
