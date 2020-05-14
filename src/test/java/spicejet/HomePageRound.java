package spicejet;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomeObjects;
import resources.base;

import java.io.FileInputStream;
import java.io.IOException;

public class HomePageRound extends base {


    @BeforeTest
    public void open() throws IOException, InterruptedException {
        driver = browserdriver();
        driver.get("https://book.spicejet.com");
        driver.manage().window().maximize();
    }


    @Test
    public void basePage() throws IOException, InterruptedException {


        HomeObjects h = new HomeObjects(driver);
        h.getrdioroundtrip().click();
        Assert.assertTrue(h.getrdioroundtrip().isEnabled());
        h.getcheckboxfamil().click();
        Assert.assertTrue(h.getcheckboxfamil().isSelected());
        h.getfrome().click();
        Select FROM = new Select(h.getfrome());
        FROM.selectByValue("AMD");
        h.getfrome().click();

        h.getto().click();
        Select TO = new Select(h.getto());
        TO.selectByValue("MAA");


        h.getdepatrdate().click();
        while (!h.getmonth().getText().contains("November ")) {
            h.getright().click();
        }

        int count = h.getday().size();
        for (int i = 0; i < count; i++) {
            String text = h.getday().get(i).getText();
            if (text.equalsIgnoreCase("23")) {
                h.getday().get(i).click();
                break;
            }
        }
        h.getdate2().click();
        int count2 = h.getday2().size();
        for (int i = 0; i < count2; i++) {
            String text = h.getday2().get(i).getText();
            if (text.equalsIgnoreCase("28")) {
                h.getday2().get(i).click();
                break;
            }
        }




        h.getpassengers().click();

        Select ADULT = new Select(h.getadult());
        ADULT.selectByIndex(4);

        Select CHILD = new Select(h.getchild());
        CHILD.selectByIndex(2);

        Select INFANT = new Select(h.getinfant());
        INFANT.selectByIndex(2);



        Select CURRENCY = new Select(h.getcurrency());
        CURRENCY.selectByValue("USD");

        Assert.assertEquals(h.getsearchname().getText(),"SEARCH");
        h.getsearch().click();
    }
    @AfterTest
    public void close (){
        driver.close();
        driver=null;
    }
}
