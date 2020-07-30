package spicejet;

import org.testng.annotations.Test;
import pageObjects.HomeObjects;
import resources.base;

public class HomePageRound extends base {
    @Test
    public void  HomePageRound () throws InterruptedException {
        driver.get(url);
        HomeObjects h = new HomeObjects(driver);
        h.setRdioroundtrip();
        Thread.sleep(4000);
        h.setFrome("AMD");
        Thread.sleep(4000);
        h.setTo("MAA");
        h.setCheckboxfamil();
        h.setDepatrdate();
        h.setDay();
        h.setDate2();
        h.setPassengers();
        h.setAdult();
        h.setChild();
        h.setInfant();
        h.setSearch();
    }
}

