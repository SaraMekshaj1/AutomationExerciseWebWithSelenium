package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class CartPage extends BasePage {


    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//h2[text()='Subscription']")
    private WebElement subscriptionH2Text;

    @FindBy(css = "input[id='susbscribe_email']")
    private WebElement subscriptionEmailField;

    @FindBy(id = "success-subscribe")
    private WebElement successfulSubscriptionMessage;

    @FindBy(css = "button[id='subscribe']")
    private WebElement subscribeButtonFooter;

    @FindBy(xpath = "//td[@class='cart_description']/h4/a[contains(text(), 'Blue Top')]")
    private WebElement blueTopProduct;

    @FindBy(xpath = "//td[@class='cart_description']/h4/a[contains(text(), 'Men Tshirt')]")
    private WebElement menTshirt;

    @FindBy(css = "a[href='/product_details/1']")
    private WebElement blueTopProductIsVisibleAtCart;

    @FindBy(css = "button.disabled")
    private WebElement quantityOfProduct;

    @FindBy(css = "a.btn.btn-default.check_out")
    private WebElement proceedToCheckOutButton;

    @FindBy(css = "#checkoutModal a[href='/login']")
    private WebElement registerLoginButtonOnCheckoutModal;

    @FindBy(css="ol.breadcrumb > li.active")
    private WebElement shoppingCartText;


    public boolean isBlueTopShownInCart() {
        return blueTopProductIsVisibleAtCart.isDisplayed();
    }
    public boolean isShoppingCartTextVisible(){
        return shoppingCartText.isDisplayed();
    }

    public String getQuantity() {
        return quantityOfProduct.getText().trim();
    }

    public boolean isSubscriptionDisplayed() {
        scrollToElementJS(driver,subscriptionH2Text);
        return subscriptionH2Text.isDisplayed();
    }

    public void setEmailAtSubscriptionField(String email) {
        set(subscriptionEmailField, email);
        click(subscribeButtonFooter);
    }

    public String messageDisplayed() {
        return successfulSubscriptionMessage.getText();
    }

    public boolean isBlueTopProductVisible() {
        return blueTopProduct.isDisplayed();
    }

    public boolean isMenTshirtProductVisible() {
        return menTshirt.isDisplayed();
    }

    public boolean isProceedToCheckOutVisible() {
        return proceedToCheckOutButton.isDisplayed();
    }

    public CheckoutPage clickProceedToCheckoutButton() {
        click(proceedToCheckOutButton);
        return new CheckoutPage(driver);

    }

    public Signup_LoginPage clickRegisterLoginAtCheckoutButton() {
        click(registerLoginButtonOnCheckoutModal);
        return new Signup_LoginPage(driver);
    }
}
