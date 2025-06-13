package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private By allProductsH2= By.cssSelector("h2.title.text-center");
    private By viewFirstProductBlueTop=By.cssSelector("a[href='/product_details/1'");

    public boolean isAllProductH2textDisplayed(){
        return find(allProductsH2).isDisplayed();
    }

    public  Product1BlueTop clickViewFirstProductBlueTop(){
        click(viewFirstProductBlueTop);
        return new Product1BlueTop();
    }



}
