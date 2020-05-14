package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomeObjects {
    public WebDriver driver;

    public HomeObjects(WebDriver driver) {
        this.driver = driver;
    }

    private By frome = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1");

    private By to = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1");

    private By checkboxfamil = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends");
    private By depatrdate = By.xpath("//div[@id='marketDate_1']//input[1]");
    private By month = By.className("ui-datepicker-title");
    private By right = By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
    private By day = By.className("ui-state-default");
    private By date2 = By.xpath("//div[@id='marketDate_2']//input[1]");
    private By day2 = By.className("ui-state-default");
    private By rdioroundtrip = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip");
    private By passengers = By.id("divpaxinfo");
    private By adult = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT");
    private By child = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD");
    private By infant = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT");
    private By currency = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency");
    private By search = By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit");
    private By searchname = By.xpath("//span[@class='search-text']");


    public WebElement getdepatrdate() {
        return driver.findElement(depatrdate);
    }

    public WebElement getmonth() {
        return driver.findElement(month);
    }

    public WebElement getright() {
        return driver.findElement(right);
    }

    public List<WebElement> getday() {
        return driver.findElements(day);
    }

    public WebElement getrdioroundtrip() {
        return driver.findElement(rdioroundtrip);
    }

    public WebElement getpassengers() {
        return driver.findElement(passengers);
    }

    public WebElement getadult() {
        return driver.findElement(adult);
    }

    public WebElement getchild() {
        return driver.findElement(child);
    }

    public WebElement getinfant() {
        return driver.findElement(infant);
    }

    public WebElement getcurrency() {
        return driver.findElement(currency);
    }

    public WebElement getcheckboxfamil() {
        return driver.findElement(checkboxfamil);
    }

    public WebElement getsearch() {
        return driver.findElement(search);
    }

    public WebElement getdate2() {
        return driver.findElement(date2);
    }

    public List<WebElement> getday2() {
        return driver.findElements(day2);
    }

    public WebElement getsearchname() {
        return driver.findElement(searchname);
    }

    public WebElement getfrome() {
        return driver.findElement(frome);
    }

    public WebElement getto() {
        return driver.findElement(to);
    }
}
