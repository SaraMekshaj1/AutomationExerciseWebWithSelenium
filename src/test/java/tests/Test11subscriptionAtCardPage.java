package tests;

import base.BasePage;
import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test11subscriptionAtCardPage  extends BaseTest {

    @Test
    public void test11(){
        boolean isHomePageVisible = homePage.isSliderVisible();
        Assert.assertTrue(isHomePageVisible);
       var cardPage= homePage.clickCartNavBarButton();
       cardPage.setEmailAtSubscriptionField("s25akfj@gmail.com");
        String expectedAlertText="You have been successfully subscribed!";
        Assert.assertEquals(cardPage.messageDisplayed(),expectedAlertText);




    }
}
