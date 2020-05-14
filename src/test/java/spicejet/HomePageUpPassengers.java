package spicejet;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomeObjects;
import resources.base;

import java.io.IOException;

public class HomePageUpPassengers extends base {


    @BeforeTest
    public void open() throws IOException {
        driver = browserdriver();
        driver.get("https://book.spicejet.com");
        driver.manage().window().maximize();
    }


    @Test
    public void basePage() throws IOException, InterruptedException {


        HomeObjects h = new HomeObjects(driver);
        h.getrdioroundtrip().click();
        // h.getcheckboxfamil().click();
        h.getfrome().click();
        Select FROM = new Select(h.getfrome());
        FROM.selectByValue("BLR");
        h.getfrome().click();

        h.getto().click();
        Select TO = new Select(h.getto());
        TO.selectByValue("RDP");


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
        ADULT.selectByIndex(8);

        Select CHILD = new Select(h.getchild());
        CHILD.selectByIndex(1);

       driver.switchTo().alert().accept();

    }
    @AfterTest
    public void close (){
       driver.close();
       driver=null;
    }
}
