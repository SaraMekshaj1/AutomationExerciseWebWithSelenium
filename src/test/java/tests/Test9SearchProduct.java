package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test9SearchProduct extends BaseTest {

    @Test
    public void test9(){
        var productPage=homePage.clickProductsPage();
        productPage.searchProduct("Sleeveless ");
        Assert.assertTrue(productPage.resultsSearchSleeveless(),"Product contains sleeveless are not shown ");
        Assert.assertTrue(
                productPage.doAllResultsContain("Sleeveless"),
                "Not all product titles contain 'Sleeveless'"
        );

        productPage.searchProduct("tshirt");

        //here we have a failed test
        Assert.assertTrue(
                productPage.doAllResultsContain("tshirt"),
                "Not all product titles contain 'tshirt'"
        );
        productPage.searchProduct("t-shirt");
        Assert.assertTrue(
                productPage.doAllResultsContain("t-shirt"),
                "Not all product titles contain 't-shirt'"
        );

        int resultsWithoutHyphen = productPage.getSearchResultTitles().size();

        productPage.searchProduct("t-shirt");
        int resultsWithHyphen = productPage.getSearchResultTitles().size();

        Assert.assertTrue(resultsWithHyphen <= resultsWithoutHyphen,
                "Search with 't-shirt' should not return more results than 'tshirt'");





    }
}
