package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class Product1BlueTop extends BasePage {

   private By product1Name=By.xpath("//h2[text()='Blue Top']");
   private By product1Category=By.xpath("//p[text()='Category: Women > Tops']");
   private By product1price=By.xpath("//span[contains(text(),'Rs. 500')]");
   private By product1Availability=By.xpath("//p[contains(text(),'In Stock')]");
   private By product1Condition=By.xpath("//p[contains(text(),'New')]");
   private By product1Brand=By.xpath("//p[contains(text(),'Polo')]");
    public boolean isProduct1NameDisplayed(){
        return find(product1Name).isDisplayed();
    }
    public boolean isProduct1CategoryDisplayed(){
        return find(product1Category).isDisplayed();
    }
    public boolean isProduct1PriceVisible(){
        return find(product1price).isDisplayed();
    }
    public boolean isProduct1Available(){
        return find(product1Availability).isDisplayed();
    }
    public boolean isProduct1ConditionVisible(){
        return find(product1Condition).isDisplayed();
    }
    public boolean isProduct1BrandVisible(){
        return find(product1Brand).isDisplayed();
    }
}
