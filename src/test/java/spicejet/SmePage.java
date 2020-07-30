package spicejet;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.SmeObjectes;
import resources.base;

import java.util.Iterator;
import java.util.Set;

public class SmePage extends base {



    @Test(dataProvider = "getdata")
    public void SemPage (String us ,String ps) throws InterruptedException {
        driver.get(url);
        SmeObjectes s = new SmeObjectes(driver);
        Thread.sleep(2000);
        s.setLogin();
        Thread.sleep(2000);
        s.setSme();
        Thread.sleep(2000);

        Set<String> ids =driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String parentid =it.next();
        String childid = it.next();
        driver.switchTo().window(childid);

        Thread.sleep(5000);
        s.setUsername(us);

        s.setPassword(ps);
        s.setSingin();
        Thread.sleep(5000);
        s.setErrormessage();



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
}
