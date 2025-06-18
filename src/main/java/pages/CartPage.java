package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class CartPage extends BasePage {
    private By substripionH2TEXT= By.xpath("//h2[text()='Subscription']");
    private By subscriptionEmailField=By.cssSelector("input[id='susbscribe_email']");
    private By succesfullSubscribtionMessage=By.id("success-subscribe");
    private By subscribeButtonFooter=By.cssSelector("button[id='subscribe']");

    private By blueTopProduct=By.xpath("//td[@class='cart_description']/h4/a[contains(text(), 'Blue Top')]");
    private By menTshirt=By.xpath("//td[@class='cart_description']/h4/a[contains(text(), 'Men Tshirt')]");



    public  boolean isSubscriptionDisplayed(){
        scrollToElementJS(substripionH2TEXT);
        return find(substripionH2TEXT).isDisplayed();
    }

    public void setEmailAtSubscriptionField(String email){
        set(subscriptionEmailField,email);
        click(subscribeButtonFooter);
    }
    public String  messageDisplayed(){
        return find(succesfullSubscribtionMessage).getText();
    }

    public boolean isBlueTopProductVisible(){
        return find(blueTopProduct).isDisplayed();
    }

    public  boolean isMenTshirtProductVisible(){
        return  find(menTshirt).isDisplayed();
    }
}
