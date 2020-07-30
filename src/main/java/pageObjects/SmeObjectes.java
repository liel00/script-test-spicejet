package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class SmeObjectes {

    public WebDriver driver;

    public SmeObjectes(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Login")
    WebElement login;

    @FindBy(xpath = "//a[contains(text(),'SME Travellers')]")
    WebElement sme;

    @FindBy(id = "UserName")
    WebElement username;

    @FindBy(id = "LoginPassword")
    WebElement password;

    @FindBy(id = "btnSignin")
    WebElement singin;

    @FindBy(xpath = "//div[@class='alert alert-warning']")
    WebElement errormessage;

    public void setLogin() {
        Actions a = new Actions(driver);
        a.moveToElement(login).build().perform();
    }

    public void setSme() {
        Actions a = new Actions(driver);
        a.moveToElement(sme).click().build().perform();
    }

    public void setUsername(String us) {
        username.clear();
        username.sendKeys(us);
    }

    public void setPassword(String ps) {
        password.sendKeys(ps);
    }

    public void setSingin() {
        singin.click();

    }

    public void  setErrormessage() {
        Assert.assertEquals(errormessage.getText(), "  No Account found. Please contact Airline/SME Administrator.");
    }

}





