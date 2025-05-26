package tests;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Test1RegisterUser extends BaseTest {

    public void  isHomePageVisible(){
      boolean isHomePageVisible = homePage.isSliderVisible();
        Assert.assertTrue(isHomePageVisible);

    }


}
