package tests;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.DropDownUtility.getFirstSelectedOption;

public class Test14PlaceOrder extends BaseTest {

    @Test
    public void test14() {
        boolean isHomePageVisible = homePage.isSliderVisible();
        Assert.assertTrue(isHomePageVisible, "Home Page is not visible");
        homePage.addToCartSleevelessDress();
        homePage.clickContinueButton();
        homePage.addToCartFancyGreenTop();
       var cartPage= homePage.clickCartNavBarButton();
       Assert.assertTrue(cartPage.isProceedToCheckOutVisible(),"ProceedToCheckOut button is not visible , so you are not in the cart page");
       cartPage.clickProceedToCheckoutButton();

       var  signupLoginPage=cartPage.clickRegisterLoginAtCheckoutButton();
        signupLoginPage.setNameAtSignUp("Zoi");
        signupLoginPage.setEmailAtSignUp("zoiMalaj@gmail.com");
        var accountInformationPage=signupLoginPage.clickSignUpButton();
        Assert.assertTrue(accountInformationPage.isEnterAccountInformationVisible(),"ENTER ACCOUNT INFORMATION is not available");

        accountInformationPage.clickTitleMsrRadioButton();
        boolean isMscRadioButtonSelected = accountInformationPage.isMrsRadioButtonSelected();
        Assert.assertTrue(isMscRadioButtonSelected, "Msc radio button should be selected");

        accountInformationPage.setName("Zoi");
        accountInformationPage.setPassword("1234567");

        accountInformationPage.selectDayDropDown("14");
        Assert.assertEquals(accountInformationPage.getSelectedDay(), "14");

        accountInformationPage.selectYearDropDown("2001");
        Assert.assertEquals(accountInformationPage.getSelectedYear(), "2001");

        accountInformationPage.selectMonthDropDown(3);
        Assert.assertEquals(accountInformationPage.getSelectedMonth(), "March");

        accountInformationPage.clickNewsletterCheckBox();
        boolean isNewsLetterSelected= accountInformationPage.isNewsLetterCheckBoxSelected();
        Assert.assertTrue(isNewsLetterSelected);

        accountInformationPage.clickReceiveSpecialOffersCheckbox();
        boolean isSpecialOffersChBoxSelected=accountInformationPage.isReceiveSpecialOffersCheckboxSelected();
        Assert.assertTrue(isSpecialOffersChBoxSelected);

        accountInformationPage.setFirstName("Zoi");
        accountInformationPage.setLastName("Malaj");
        accountInformationPage.setCompanyName("Solution One");
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
        Assert.assertEquals(actualText,"Logged in as Zoi","Logged In as Zoi is not shown in main page ");

        cartPage= homePage.clickCartNavBarButton();
        cartPage.clickProceedToCheckoutButton();














    }
}
