package Apages;

import Dutils.commonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpageWithPageFactory extends commonMethods {
    @FindBy(id = "txtUsername")
    public WebElement username;

    @FindBy (id = "txtPassword")
    public WebElement password;

    @FindBy(id = "btnLogin")
    public WebElement button;
    public loginpageWithPageFactory(){
        PageFactory.initElements(driver,this);
    }

}
