package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test16LoginBeforeCheckout extends BaseTest {

    @Test
    public void test16(){
        Assert.assertTrue(  homePage.isSliderVisible(),"Home page is not visible");
        var signupLoginPage=homePage.clickSignLoginPage();
        signupLoginPage.logIntoApplication("era154@gmail.com","7654321");
        String actualText=homePage.getLoginInAsText();

        Assert.assertTrue(actualText.contains("Logged in as Era" ),
                "Expected 'Logged in as Era' but got: " + actualText);homePage.addToCartSleevelessDress();
        homePage.addToCartFancyGreenTop();
        homePage.addToCartSleevelessDress();
        var cartPage= homePage.clickCartNavBarButton();
        Assert.assertTrue(cartPage.isShoppingCartTextVisible(),"Shopping cart text is not visible");
        var checkoutPage= cartPage.clickProceedToCheckoutButton();
        Assert.assertTrue(checkoutPage.isAddressDetailsVisible());


        Assert.assertEquals(checkoutPage.getDeliveryName(), "Mrs. Era Neraj");
        Assert.assertTrue(checkoutPage.getDeliveryStreetCompanyAndBuilding().contains("SmartSolution"));
        // Assert.assertTrue(checkoutPage.getDeliveryStreetCompanyAndBuilding().contains("S John St"));
        // Assert.assertTrue(checkoutPage.getDeliveryStreetCompanyAndBuilding().contains("Apt 4B, Building 5"));
        Assert.assertEquals(checkoutPage.getDeliveryCityStateZip(),"Frankton Indiana 46044","The address is not the same you use at registration");
        Assert.assertEquals(checkoutPage.getDeliveryCountry(),"United States","The country  is not the same you use at registration");
        Assert.assertEquals(checkoutPage.getDeliveryPhone(),"(765) 555-4324","The phone number is not the same you use at registration");

        Assert.assertTrue(checkoutPage.getBillingAddressText().contains("Era Neraj"));
        Assert.assertTrue(checkoutPage.getBillingAddressText().contains("SmartSolution"));

        Assert.assertTrue(checkoutPage.isReviewOrderSectionVisible(), "Review Your Order section is not visible");

        checkoutPage.enterTextAtCommentArea("I would like to take a confirmation into my phone number that you take the order");
        var paymentPage=checkoutPage.clickPlaceOrder();
        paymentPage.writeNameOnCard("Sara");
        paymentPage.writeCardNumber("1234");
        paymentPage.writeCvc("321");
        paymentPage.writeExpirationMonth("08");
        paymentPage.writeExpirationYear("2027");
        paymentPage.clickPayAndConfirmOrder();
        Assert.assertTrue(paymentPage.isCongratulationMessageForOrderPlacedVisible(), "Congratulation message not visible ");
        paymentPage.clickContinueButton();





    }
}
