package spicejet;

import org.testng.annotations.Test;
import pageObjects.HomeObjects;
import resources.Base;

public class HomePageOneWay extends Base {
   @Test
    public void  HomePageOneWay () throws InterruptedException {
       driver.get(url);
       HomeObjects h = new HomeObjects(driver);
       h.setFrome("AMD");
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
