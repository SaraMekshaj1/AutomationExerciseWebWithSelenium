package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCases  extends BasePage {
    public TestCases(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//div[@class='col-sm-9 col-sm-offset-1']//b[text()='Test Cases']")
    WebElement testCasesTitlePage;

    public boolean isTestCasesTitleVisible(){
        return testCasesTitlePage.isDisplayed();
    }



}
