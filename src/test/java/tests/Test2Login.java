package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2Login extends BaseTest {

    @Test
    public void test2LoginTest(){
        var signupLoginPage=homePage.clickSignLoginPage();
        signupLoginPage.logIntoApplication("s25akfj@gmail.com", "1234567");

        String actualText=homePage.getLoginInAsText();
        Assert.assertEquals(actualText,"Logged in as Sara","Logged In as Sara is not shown in main page ");

        //here should be removed in order to have an account for other tests
            var deletedAccount=homePage.clickDeleteButton();
       Assert.assertTrue(deletedAccount.isAcoountDeletedMSGvisible(),"Delete message is not visible");

       deletedAccount.clickContinueButton();


    }


}
