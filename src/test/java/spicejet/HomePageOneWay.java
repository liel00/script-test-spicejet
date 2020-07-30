package spicejet;

import org.testng.annotations.Test;
import pageObjects.HomeObjects;
import resources.base;

public class HomePageOneWay extends base {
   @Test
    public void  HomePageOneWay () throws InterruptedException {
       driver.get(url);
       HomeObjects h = new HomeObjects(driver);
       Thread.sleep(4000);
       h.setFrome("AMD");
       Thread.sleep(4000);
       h.setTo("MAA");
       h.setCheckboxfamil();
       h.setDepatrdate();
       h.setDay();
       h.setPassengers();
       h.setAdult();
       h.setChild();
       h.setInfant();
       h.setSearch();
   }
}
