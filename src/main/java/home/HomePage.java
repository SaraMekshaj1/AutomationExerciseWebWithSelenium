package home;

import base.BasePage;
import org.openqa.selenium.By;
import pages.*;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By slider= By.xpath("//section[@id='slider']");
    private By loginSigninHomeButton = By.xpath("//a[@href='/login']");
    private By logedAsNAME=By.xpath("//a[contains(., 'Logged in as') and .//b[text()='Sara']]");
    private By deleteAccountButton=By.xpath("//a[@href='/delete_account']");
    private By logoutButton=By.xpath("//a[@href='/logout']");
    private By productsNavBarButton=By.xpath("//a[@href='/products']");
    private By cartNavBarButton=By.xpath("//a[@href='/view_cart']");
    private  By contactUsNavBarButton=By.xpath("//a[@href='/contact_us']");
    private  By testCasesNavButton=By.cssSelector("a[href='/test_cases']");
    private  By subscriptionFieldFooter=By.cssSelector("input[id='susbscribe_email']");
    private  By subscribeButtonFooter=By.cssSelector("button[id='subscribe']");
    private  By succesfullSubscribtionMessage=By.id("success-subscribe");
    private By viewBlueTopButton=By.cssSelector("a[href='/product_details/1']");

    public TestCases clickTestCasesNavButton(){
        click(testCasesNavButton);
        return new TestCases();
    }

    public CartPage clickCartNavBarButton(){
        click(cartNavBarButton);
        return new CartPage();
    }

    public boolean isSliderVisible(){
        return find(slider).isDisplayed();
    }
    public Signup_LoginPage clickSignLoginPage() {
        click(loginSigninHomeButton);
        return new Signup_LoginPage();
    }

    public ProductsPage clickProductsPage(){
        click(productsNavBarButton);;
        return new ProductsPage();
    }

public DeleteAccountPage clickDeleteButton(){
        click(deleteAccountButton);
        return new DeleteAccountPage();
}
    public String getLoginInAsText(){
        return find(logedAsNAME).getText();
    }
    public boolean isDeleteButtonVisible(){
        return find(deleteAccountButton).isDisplayed();
    }
    public Signup_LoginPage clickLogOut(){
        click(logoutButton);
        return new Signup_LoginPage();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public ContactUsPage clickContactUs(){
        click(contactUsNavBarButton);
        return new ContactUsPage();

    }

    public void setEmailAtSubscriptionSection(String email){
        scrollToElementJS(subscribeButtonFooter);
        set(subscriptionFieldFooter,email);
        click(subscribeButtonFooter);

    }
    public String  messageDisplayed(){
        return find(succesfullSubscribtionMessage).getText();
    }

    public  ProductsPage clickViewBlueTopProduct(){
        scrollToElementJS(viewBlueTopButton);
        click(viewBlueTopButton);
        return new ProductsPage();
    }




}
