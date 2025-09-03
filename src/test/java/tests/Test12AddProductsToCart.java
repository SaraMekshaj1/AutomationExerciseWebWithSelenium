package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test12AddProductsToCart extends BaseTest {

    @Test
    public void test12() throws InterruptedException {
        boolean isHomePageVisible = homePage.isSliderVisible();
        Assert.assertTrue(isHomePageVisible);
         var productsPage=  homePage.clickProductsPage();

         productsPage.hoverOverBlueTopProduct();
         productsPage.clickAddToCartBlueTop();
         productsPage.clickContinueButton();

      //   productsPage.hoverOverMenTshirtProduct();
     //    productsPage.clickAddToCartMenTshirt();
      //   productsPage.clickContinueButton();

         var cartPage=homePage.clickCartNavBarButton();
         Assert.assertTrue(cartPage.isBlueTopProductVisible(),"Blue top is not visible into the cart page");
      //   Assert.assertTrue(cartPage.isMenTshirtProductVisible(),"Ment tshirt is not visible into the cart page");










    }
}
