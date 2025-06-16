package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class Test10Subscription extends BaseTest {

    @Test
    public void test10(){
        homePage.setEmailAtSubscriptionSection("s25akfj@gmail.com");
        String expectedAlertText="You have been successfully subscribed!";
        Assert.assertEquals(homePage.messageDisplayed(),expectedAlertText);


    }



}

