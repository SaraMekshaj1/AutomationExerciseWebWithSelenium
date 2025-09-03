package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5RegisterWithExistingMail extends BaseTest {
    @Test
    public void test5(){
       var signUpPage= homePage.clickSignLoginPage();
        signUpPage.setNameAtSignUp("Vera");
        signUpPage.setEmailAtSignUp("s25akfj@gmail.com");
        signUpPage.clickSignUpButton();

        Assert.assertTrue(signUpPage.isEmailAddressAlreadyExistMsgVisible());

    }

}
