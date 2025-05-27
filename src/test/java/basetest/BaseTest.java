package basetest;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    private WebDriver driver;
    protected BasePage basePage;
    private String url="https://automationexercise.com/";
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
      driver=new ChromeDriver();
      driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage=new BasePage();
        basePage.setDriver(driver);
        homePage=new HomePage();
        setUtilityDriver();

    }

    @AfterClass
    public void tearDown(){

    }



}
