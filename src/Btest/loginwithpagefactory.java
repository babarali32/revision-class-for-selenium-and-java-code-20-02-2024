package Btest;

import Apages.loginpageWithPageFactory;
import CtestBase.baseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class loginwithpagefactory {
    public static void main(String[] args) {

        baseClass.openwithspecificurl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        loginpageWithPageFactory obj1=new loginpageWithPageFactory();
        obj1.username.sendKeys("Admin");
        obj1.password.sendKeys("Hum@nhrm123");
        obj1.button.click();

        TakesScreenshot ts=(TakesScreenshot) baseClass.driver;
        File fs=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(fs,new File("one/pic.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}