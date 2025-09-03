package basetest;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.TestResult;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected  WebDriver driver;
    protected BasePage basePage;
    private String url="https://automationexercise.com/";
    protected HomePage homePage;
    protected DesiredCapabilities dc=new DesiredCapabilities();

    @BeforeClass
    public void setUp(){
     driver=new ChromeDriver();
      driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage=new BasePage(driver);
       homePage=new HomePage(driver);


    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
        if (ITestResult.FAILURE== testResult.getStatus()){
            TakesScreenshot screenshot= (TakesScreenshot)driver ;
            File source=  screenshot.getScreenshotAs(OutputType.FILE);
            File destination=new File(System.getProperty("user.dir") +
                    "/resources/screenshots/("+
                    java.time.LocalDate.now()+
                    testResult.getName() +".png");
            try {
                FileHandler.copy(source,destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Screenshot Located at "+destination);
        }
    }


    @AfterClass
    public void tearDown(){

    }





}
