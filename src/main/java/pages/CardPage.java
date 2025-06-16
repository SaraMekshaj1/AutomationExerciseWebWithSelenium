package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class CardPage extends BasePage {
    private By substripionH2TEXT= By.xpath("//h2[text()='Subscription']");
    private By subscriptionEmailField=By.cssSelector("input[id='susbscribe_email']");
    private By succesfullSubscribtionMessage=By.id("success-subscribe");
    public By subscribeButtonFooter=By.cssSelector("button[id='subscribe']");
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
}
