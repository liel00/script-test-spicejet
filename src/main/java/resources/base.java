package resources;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class base {
    public static WebDriver driver;
    public Properties prop;


    public WebDriver browserdriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\Liel PC\\IdeaProjects\\spicejet\\src\\main\\java\\resources\\data.properties");
        prop.load(fis);
        String browsername = prop.getProperty("browser");
        System.out.println(browsername);

        if (browsername.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Liel PC\\Desktop\\TEST\\chromedriver.exe");
             driver = new ChromeDriver();
        }

       else if (browsername.equals("firefox")) {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\Liel PC\\Desktop\\TEST\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        else if (browsername.equals("edge")) {

            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public void getScreanshot (String result) throws IOException{
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\Liel PC\\Desktop\\TEST\\Screanshot\\ddd"+result+"Screanshot.png"));
    }
}