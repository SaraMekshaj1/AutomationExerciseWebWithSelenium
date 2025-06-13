package tests;

import base.BasePage;
import basetest.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test8ProductsPage extends BaseTest {


    @Test
    public void test8(){
        var productsPage=homePage.clickProductsPage();
        Assert.assertTrue(productsPage.isAllProductH2textDisplayed(),"All Products are not displayed");
        var product1PageBlueTop=productsPage.clickViewFirstProductBlueTop();
        Assert.assertTrue(product1PageBlueTop.isProduct1NameDisplayed(),"Product Name not displayed");
        Assert.assertTrue(product1PageBlueTop.isProduct1CategoryDisplayed(),"Item 1 category not displayed");
        Assert.assertTrue(product1PageBlueTop.isProduct1PriceVisible(),"Product price is not displayed");
        Assert.assertTrue(product1PageBlueTop.isProduct1Available(),"Product1  is not available");
        Assert.assertTrue(product1PageBlueTop.isProduct1ConditionVisible(),"Product 1 condition is not shown");
        Assert.assertTrue(product1PageBlueTop.isProduct1BrandVisible(),"Product brand is not visible");





    }

}
