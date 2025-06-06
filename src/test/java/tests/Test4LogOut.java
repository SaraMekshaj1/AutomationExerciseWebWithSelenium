package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4LogOut extends BaseTest {

    @Test
    public void test4() {
        var signupLoginPage = homePage.clickSignLoginPage();
        signupLoginPage.logIntoApplication("s25akfj@gmail.com", "1234567");

        String actualText = homePage.getLoginInAsText();
        Assert.assertEquals(actualText, "Logged in as Sara", "Logged In as Sara is not shown in main page ");

        homePage.clickLogOut();

        String currentUrl = homePage.getCurrentUrl(); // From POM
        Assert.assertTrue(currentUrl.contains("login"),
                "User is not redirected to the login page. Current URL: " + currentUrl);







    }
}
