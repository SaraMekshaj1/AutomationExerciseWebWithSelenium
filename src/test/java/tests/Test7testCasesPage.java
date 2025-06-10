package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test7testCasesPage extends BaseTest {

    @Test
    public void test(){
        var testCasesPage=homePage.clickTestCasesNavButton();
        Assert.assertTrue(testCasesPage.isTestCasesTitleVisible(),"Test cases title page not displayed, you not in right page ");
    }
}
