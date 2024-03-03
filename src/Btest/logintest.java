package Btest;

import Apages.loginpage;
import CtestBase.baseClass;

public class logintest {
    public static void main(String[] args) {

        baseClass.openwithspecificurl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/pim/viewPimModule");
        loginpage obj=new loginpage();
        obj.username.sendKeys("Admin");
        obj.password.sendKeys("Hum@nhrm123");
        obj.clickbutton.click();

    }
}
