package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmeObjects {
    public WebDriver driver;

    public SmeObjects(WebDriver driver){
        this.driver = driver;
    }

    private By sme = By.xpath("//a[contains(text(),'SME Travellers')]");
    private By login = By.id("Login");
    private By username = By.id("UserName");
    private By password = By.id("LoginPassword");
    private By singin = By.id( "btnSignin");

    public WebElement getlogin(){
        return driver.findElement(login);
    }
    public WebElement getsme (){
        return driver.findElement(sme);
    }
    public WebElement getusername (){
        return driver.findElement(username);
    }
    public WebElement getpassword (){
        return driver.findElement(password);
    }
    public WebElement getsingin(){
        return driver.findElement(singin);
    }
}

