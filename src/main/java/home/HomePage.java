package home;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//section[@id='slider']")
    WebElement slider;

    @FindBy(xpath="//a[@href='/login']")
   WebElement loginSignInHomeButton ;

    @FindBy(xpath = "//li/a[contains(.,'Logged in as')]")
    WebElement loggedAsNAME;

    @FindBy(xpath="//a[@href='/delete_account']")
    WebElement deleteAccountButton;

    @FindBy(xpath="//a[@href='/logout']")
    WebElement logoutButton;

    @FindBy(xpath="//a[@href='/products']")
    WebElement productsNavBarButton;

    @FindBy(xpath="//a[@href='/view_cart']")
    WebElement cartNavBarButton;

    @FindBy(xpath="//a[@href='/contact_us']")
    WebElement contactUsNavBarButton;

    @FindBy(css="a[href='/test_cases']")
    WebElement testCasesNavButton;

    @FindBy(css="input[id='susbscribe_email']")
    WebElement subscriptionFieldFooter;

    @FindBy(id="subscribe")
    WebElement subscribeButtonFooter;

    @FindBy(id="success-subscribe")
    WebElement successfulSubscriptionMessage;

    @FindBy(css="a[href='/product_details/1']")
    WebElement viewBlueTopButton;

    @FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']")
    WebElement continueShoppingPopupButton;

    @FindBy(xpath="//div[@class='productinfo text-center'][.//h2[text()='Rs. 1000'] and .//p[contains(text(),'Sleeveless')]]//a[@data-product-id='3' and contains(@class, 'add-to-cart')]")
    WebElement addToCartSleevelessDressButton;

    @FindBy(xpath="//div[@class='productinfo text-center'][.//h2[text()='Rs. 700'] and .//p[contains(text(),'Fancy Green Top')]]//a[@data-product-id='8' and contains(@class, 'add-to-cart')]")
    WebElement addToCartFancyGreenTopButton;

    public void addToCartFancyGreenTop(){
        scrollToElementJS(driver,addToCartFancyGreenTopButton);
        click(addToCartFancyGreenTopButton);
        clickContinueButton();
    }
    public void clickContinueButton(){
        waitUntilVisible( continueShoppingPopupButton,3);
        click(continueShoppingPopupButton);
    }

    public void addToCartSleevelessDress(){
        scrollToElementJS(driver,addToCartSleevelessDressButton);
       click(addToCartSleevelessDressButton);

    }
    public TestCases clickTestCasesNavButton(){
        click(testCasesNavButton);
        return new TestCases(driver);
    }

    public CartPage clickCartNavBarButton(){
        click(cartNavBarButton);
        return new CartPage(driver);
    }

    public boolean isSliderVisible(){
        return slider.isDisplayed();
    }
    public Signup_LoginPage clickSignLoginPage() {
        click(loginSignInHomeButton);
        return new Signup_LoginPage(driver);
    }

    public ProductsPage clickProductsPage(){
        click(productsNavBarButton);
        return new ProductsPage(driver);
    }

public DeleteAccountPage clickDeleteButton(){
        click(deleteAccountButton);
        return new DeleteAccountPage(driver);
}
    public String getLoginInAsText(){
        return loggedAsNAME.getText().trim();
    }
    public boolean isDeleteButtonVisible(){
        return deleteAccountButton.isDisplayed();
    }
    public Signup_LoginPage clickLogOut(){
        click(logoutButton);
        return new Signup_LoginPage(driver);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public ContactUsPage clickContactUs(){
        click(contactUsNavBarButton);
        return new ContactUsPage(driver);

    }

    public void setEmailAtSubscriptionSection(String email){
        scrollToElementJS(driver,subscribeButtonFooter);
        set(subscriptionFieldFooter,email);
        click(subscribeButtonFooter);

    }
    public String  messageDisplayed(){
        return successfulSubscriptionMessage.getText();
    }

    public  ProductsPage clickViewBlueTopProduct(){
        scrollToElementJS(driver,viewBlueTopButton);
        click(viewBlueTopButton);
        return new ProductsPage(driver);
    }
}
