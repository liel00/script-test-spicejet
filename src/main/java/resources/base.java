package resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver;
    private String browser = "chrome";
    private String Screanshot = "C:\\Users\\Liel PC\\IdeaProjects\\spicejet2\\src\\test\\Screanshot";
    public String url = "https://book.spicejet.com";
    public String resolution = "1920x1080";

    @BeforeClass
    public void browser (){
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();


        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
        }
        else if (browser.equals("edge")){
            WebDriverManager.edgedriver().setup();
             driver = new EdgeDriver();
        }
        driver.manage().deleteAllCookies();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5 , TimeUnit.SECONDS );

    }

    @BeforeClass
    public void resolution (){

        if (resolution.equals("800x600")){
            Dimension dimension = new Dimension(800, 600);
            driver.manage().window().setSize(dimension);
        }

        else if (resolution.equals("1024x768")){
            Dimension dimension = new Dimension(1024, 768);
            driver.manage().window().setSize(dimension);
        }
        else if (resolution.equals("1280x800")){
            Dimension dimension = new Dimension(1280, 800);
            driver.manage().window().setSize(dimension);
        }
        else if (resolution.equals("1920x1080")){
            Dimension dimension = new Dimension(1920, 1080);
            driver.manage().window().setSize(dimension);
        }

        else if (resolution.equals("2048x1536")){
            Dimension dimension = new Dimension(2048, 1080);
            driver.manage().window().setSize(dimension);
        }


    }
    @AfterClass
        public void close (){
        driver.close();
        driver=null;
    }

    public void getScreanshot (String result) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src ,new File(Screanshot+result+"Screanshot.png"));
    }



}
