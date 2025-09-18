package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test15RegisterBeforeCheckout extends BaseTest {

    @Test
    public void test15PlaceOrder(){
        boolean areInHomePage=homePage.isSliderVisible();
        Assert.assertTrue(areInHomePage,"Slider not visible, you are not at home page");
        var signUpLoginPage=homePage.clickSignLoginPage();
        signUpLoginPage.setNameAtSignUp("Era");
        signUpLoginPage.setEmailAtSignUp("era154@gmail.com");

        var accountInformationPage=signUpLoginPage.clickSignUpButton();

        Assert.assertTrue(accountInformationPage.isEnterAccountInformationVisible(),"ENTER ACCOUNT INFORMATION is not available");

        accountInformationPage.clickTitleMsrRadioButton();
        boolean isMscRadioButtonSelected = accountInformationPage.isMrsRadioButtonSelected();
        Assert.assertTrue(isMscRadioButtonSelected, "Msc radio button should be selected");

        accountInformationPage.setName("Era");
        accountInformationPage.setPassword("7654321");

        accountInformationPage.selectDayDropDown("23");
        Assert.assertEquals(accountInformationPage.getSelectedDay(), "23");

        accountInformationPage.selectYearDropDown("2002");
        Assert.assertEquals(accountInformationPage.getSelectedYear(), "2002");

        accountInformationPage.selectMonthDropDown(4);
        Assert.assertEquals(accountInformationPage.getSelectedMonth(), "April");


        accountInformationPage.clickNewsletterCheckBox();
        boolean isNewsLetterSelected= accountInformationPage.isNewsLetterCheckBoxSelected();
        Assert.assertTrue(isNewsLetterSelected);

        accountInformationPage.clickReceiveSpecialOffersCheckbox();
        boolean isSpecialOffersChBoxSelected=accountInformationPage.isReceiveSpecialOffersCheckboxSelected();
        Assert.assertTrue(isSpecialOffersChBoxSelected);

        accountInformationPage.setFirstName("Era");
        accountInformationPage.setLastName("Neraj");
        accountInformationPage.setCompanyName("SmartSolution");
        accountInformationPage.setAddress1("S John St");
        accountInformationPage.setAddress2Field("Apt 4B, Building 5");
        accountInformationPage.selectCountryDropDown("United States");
        accountInformationPage.setState("Indiana");
        accountInformationPage.setCity("Frankton");
        accountInformationPage.setZipCode("46044");
        accountInformationPage.setMobileNr("(765) 555-4324");
        var accountCreatedPage=  accountInformationPage.clickCreateAccountButton();
        String accountCreatedMessage=accountCreatedPage.getPageText();
        Assert.assertEquals(accountCreatedMessage,"ACCOUNT CREATED!", "Unfortunately your account is not created successfully ");
        accountCreatedPage.clickContinueButton();
        String actualText=homePage.getLoginInAsText();
        Assert.assertEquals(actualText,"Logged in as Era","Logged In as Sara is not shown in main page ");
        homePage.addToCartFancyGreenTop();
        homePage.addToCartSleevelessDress();
        var cartPage=homePage.clickCartNavBarButton();
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

