package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.acceptAlert;


public class Test6ContactUs extends BaseTest {

    @Test
    public void test6(){
       var contactUs= homePage.clickContactUs();
       contactUs.setName("Sara");
       contactUs.setEmail("s25akfj@gmail.com");
       contactUs.setSubject("Some suggestions");
       contactUs.setMessage("Hello , this up is very good but i would suggest adding some changes ");
       contactUs.uploadFile("C:/Users/User/Downloads/suggestionsABCselenium.docx");
       contactUs.clickSubmit();
       acceptAlert();
       Assert.assertTrue(contactUs.isSuccessfulMessageSubmited());



    }
}
