package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test12AddProductsToCart extends BaseTest {

    @Test
    public void test12(){
        boolean isHomePageVisible = homePage.isSliderVisible();
        Assert.assertTrue(isHomePageVisible);
         var productsPage=  homePage.clickProductsPage();




    }
}
