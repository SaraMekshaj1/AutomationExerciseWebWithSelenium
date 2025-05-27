package tests;

import basetest.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.DropDownUtility.*;

@Test
public class Test1RegisterUser extends BaseTest {

    public void  test1(){
      boolean isHomePageVisible = homePage.isSliderVisible();
      Assert.assertTrue(isHomePageVisible);
      var signupLoginPage=homePage.clickSignLoginPage();
      Assert.assertTrue(isHomePageVisible," New User Signup is not available");
      signupLoginPage.setNameAtSingUp("Sara");
      signupLoginPage.setEmailAtSingUp("s25akfj@gmail.com");
        var accountInformationPage=signupLoginPage.clickSignUpButton();
        Assert.assertTrue(accountInformationPage.isEnterAccountInformationVisible(),"ENTER ACCOUNT INFORMATION is not available");

        accountInformationPage.clickTitleMsrRadioButton();
        boolean isMscRadioButtonSelected = accountInformationPage.isMrsRadioButtonSelected();
        Assert.assertTrue(isMscRadioButtonSelected, "Msc radio button should be selected");

        accountInformationPage.setName("Sara");
        accountInformationPage.setPassword("1234567");

        accountInformationPage.selectDayDropDown("14");
        String selectedDay = getFirstSelectedOption(By.id("days"));
        Assert.assertEquals(selectedDay, "14");

        accountInformationPage.selectYearDropDown("2001");
        String selectedYear = getFirstSelectedOption(By.id("years"));
        Assert.assertEquals(selectedYear, "2001");

        accountInformationPage.selectMonthDropDown(3); // Index-based selection (e.g., 3 = March)
        String selectedMonth = getFirstSelectedOption(By.id("months"));
        Assert.assertEquals(selectedMonth, "March");

        accountInformationPage.clickNewsletterCheckBox();
        boolean isNewsLetterSelected= accountInformationPage.isNewsLetterCheckBoxSelected();
        Assert.assertTrue(isNewsLetterSelected);

        accountInformationPage.clickreceiveSpecialOffersCheckbox();
        boolean isSpecialOffersChBoxSelected=accountInformationPage.isReceiveSpecialOffersCheckboxSelected();
        Assert.assertTrue(isSpecialOffersChBoxSelected);

        accountInformationPage.setFirstName("Sara");
        accountInformationPage.setLast_name("Malaj");
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
       Assert.assertEquals(actualText,"Logged in as Sara","Logged In as Sara is not shown in main page ");

       //here should be removed in order to have an account for other tests
       /*       var deletedAccount=homePage.clickDeleteButton();
       Assert.assertTrue(deletedAccount.isAcoountDeletedMSGvisible(),"Delete message is not visible");

       deletedAccount.clickContinueButton();

        */

    }




    }



