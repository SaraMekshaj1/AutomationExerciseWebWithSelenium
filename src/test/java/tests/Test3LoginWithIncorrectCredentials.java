package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3LoginWithIncorrectCredentials extends BaseTest {
    @Test
    public void test3login(){

        var signupLoginPage=homePage.clickSignLoginPage();
        signupLoginPage.logIntoApplication("s25akfj@gmail.com", "87818");
        String actualMessage = signupLoginPage.getWrongCredentialsLoginMessageText();
        Assert.assertEquals(actualMessage, "Your email or password is incorrect!");

    }
}
