package spicejet;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.SmeObjects;
import resources.base;

import java.io.IOException;
import java.security.Key;
import java.util.Iterator;
import java.util.Set;

public class SmePage extends base {

    @BeforeTest
    public void open() throws IOException {
        driver = browserdriver();
        driver.get("https://book.spicejet.com");
        driver.manage().window().maximize();
    }

    @Test (dataProvider = "getdata")


    public void basepage(String username , String password ) throws InterruptedException {


        driver.get("https://book.spicejet.com");
        SmeObjects s = new SmeObjects(driver);
        Actions a = new Actions(driver);
        a.moveToElement(s.getlogin()).build().perform();
        Thread.sleep(2000);
        a.moveToElement(s.getsme()).click().build().perform();

        Set <String> ids =driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid =it.next();
        String childid = it.next();
        driver.switchTo().window(childid);
        Thread.sleep(3000);

        s.getusername().clear();
        s.getusername().sendKeys(username);
        s.getpassword().sendKeys(password);
        s.getsingin().click();
        driver.switchTo().window(parentid);




    }

    @DataProvider
    public Object[][] getdata (){
        Object[][] data = new Object[2][2];
        data [0][0] = "liel1911";
        data [0][1] = "liel@gmbil.com";
        data [1][0] = "#$%%^#@$@@#!@%%^%";
        data [1][1] = "#$%#$%@234645745.com";
        return data;
    }
    @AfterTest
    public void close (){
        driver.quit();
        driver=null;
    }

}
