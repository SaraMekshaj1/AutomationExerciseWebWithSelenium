package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.By;

public class TestCases extends BasePage {

    private By testCasesTitlePage= By.xpath("//div[@class='col-sm-9 col-sm-offset-1']//b[text()='Test Cases']");

    public boolean isTestCasesTitleVisible(){
        return find(testCasesTitlePage).isDisplayed();
    }



}
