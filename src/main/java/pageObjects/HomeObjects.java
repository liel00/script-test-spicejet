package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import java.util.List;

public class HomeObjects {

    public WebDriver driver ;

    public HomeObjects (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")
    WebElement frome ;

    @FindBy (id="ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")
    WebElement to;

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")
    WebElement checkboxfamil;

    @FindBy(xpath = "//div[@id='marketDate_1']//input[1]")
    WebElement depatrdate;

    @FindBy(xpath="//span[@class='ui-icon ui-icon-circle-triangle-e']")
    WebElement right;

    @FindBy(className = "ui-datepicker-title")
    WebElement monty;

    @FindBy(className = "ui-state-default")
    List<WebElement> day ;

    @FindBy(id="divpaxinfo")
    WebElement passengers ;

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")
    WebElement adult ;

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")
    WebElement child;

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")
        WebElement infant;

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")
    WebElement currency;

    @FindBy(id ="ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit" )
    WebElement search;

    @FindBy(id="ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip")
    WebElement rdioroundtrip;

    @FindBy(xpath = "//div[@id='marketDate_2']//input[1]")
    WebElement date2;

    @FindBy(className = "ui-state-default")
    List <WebElement> day2;

    public void setRdioroundtrip(){
        rdioroundtrip.click();
    }

    public void setFrome ( String Country){
        frome.click();
        frome.sendKeys(Country);
    }

    public void setTo ( String Country){
        to.sendKeys(Country);
    }

    public void setCheckboxfamil (){
        checkboxfamil.click();
        Assert.assertTrue(checkboxfamil.isSelected());
    }

    public void setDepatrdate(){
        depatrdate.click();
        while (!monty.getText().contains("November")){
           right.click();
        }
    }

    public void setDay(){
        int count = day.size();
        for(int i= 0;i<count;i++){
            String text = day.get(i).getText();
            if (text.equalsIgnoreCase(("7"))){
                day.get(i).click();
                break;
            }
        }

    }

    public void setDate2() {
        date2.click();
        int count2 = day2.size();
        for (int i = 0; i < count2; i++) {
            String text = day2.get(i).getText();
            if (text.equalsIgnoreCase("30")) {
                day2.get(i).click();
                break;
            }
        }
    }
    public void setPassengers(){
        passengers.click();
    }
    public void setAdult(){
        Select ADULT= new Select (adult);
        ADULT.selectByIndex(3);
    }

    public void setChild(){
        Select CHILD = new Select (child);
        CHILD.selectByIndex(1);
    }

    public void setInfant(){
        Select INFANT =new Select (infant);
        INFANT.selectByIndex(2);
    }

    public void setCurrency(){
        Select CURRENCY = new Select(currency);
        CURRENCY.selectByValue("USD");
    }

    public void setSearch(){
        search.click();
    }
}
