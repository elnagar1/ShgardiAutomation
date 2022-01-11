package Courier_App.US01.TestCases;


import Courier_App.US01.ViewModel.UserModel;
import Framework.Waits;
import Framework.Web.TestBaseWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC01 extends TestBaseWeb {




    @Test
    public void testUntitledTestCase() throws IOException {
    UserModel users  =  UserModel.reader().get(0);

        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(users.getEmail());
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(users.getPassword());
        driver.findElement(By.id("btn_login kt_login_signin_submit")).click();
        WebElement element = driver.findElement(By.id("kt_aside_menu"));
        Waits.waitUntilElementLocated(5,driver,element);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        element.click();
        driver.findElement(By.linkText("Stakeholders")).click();

        WebElement courier = driver.findElement(By.linkText("Couriers"));
        Actions aa = new Actions(driver);
        aa.doubleClick(courier).perform();


    }


}
