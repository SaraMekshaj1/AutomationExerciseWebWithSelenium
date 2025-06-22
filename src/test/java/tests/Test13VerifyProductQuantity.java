package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test13VerifyProductQuantity extends BaseTest {

    @Test
    public void test13(){
        boolean isHomePageVisible = homePage.isSliderVisible();
        Assert.assertTrue(isHomePageVisible);
        var productPage= homePage.clickViewBlueTopProduct();
        Assert.assertTrue(productPage.isProductDetailsVisible(),"Product info is not visible");
        productPage.setQuantityProductDetails("4");
        productPage.addToCard();
       productPage.clickContinueButton();
       var cardPage=homePage.clickCartNavBarButton();
       cardPage.isBlueTopShownInCard();
       Assert.assertEquals(cardPage.getQuantity(),"4","Quantity is not as expected");





    }
}
