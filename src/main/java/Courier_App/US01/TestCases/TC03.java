package Courier_App.US01.TestCases;

import Courier_App.US01.ViewModel.LoginWebPageView;
import Framework.Web.TestBaseWeb;
import org.junit.Test;
import org.testng.Assert;

public class TC03 extends TestBaseWeb{
    LoginWebPageView loginPage;
     @Test
    public void loginValidPhoneAndPassword() {


        loginPage = new LoginWebPageView(driver);
        String A1 = loginPage.userLogin(USERNAME, ACCESS_KEY);
        Assert.assertTrue(A1.contains("home"));
        System.out.println("Open: " + A1);
    }
}
