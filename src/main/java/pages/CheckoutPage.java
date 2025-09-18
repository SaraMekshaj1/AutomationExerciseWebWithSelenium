package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {

    public CheckoutPage(WebDriver driver ){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='step-one']//h2[text()='Address Details']")
    private  WebElement addressDetails;

    @FindBy(xpath=" //li[@class='address_title' ]//h3[text()='Your delivery address']")
    private WebElement yourDeliveryAddressHeading;

    @FindBy(css="ul#address_delivery li.address_firstname.address_lastname")
    private WebElement deliveryName;

    @FindBy(css="ul#address_delivery li.address_address1.address_address2")
    private WebElement deliveryCompanyStreetAndBuilding;

    @FindBy(css="ul#address_delivery li.address_city.address_state_name.address_postcode")
    private WebElement deliveryCityStateZip;

    @FindBy(css="ul#address_delivery li.address_country_name")
    private WebElement deliveryCountry;

    @FindBy(css="ul#address_delivery li.address_phone")
    private WebElement deliveryPhone;

    @FindBy(css="ul[id='address_invoice']")
    private WebElement yourBillingAddressBlock;

    @FindBy(xpath = "//div[@class='step-one']//h2[text()='Review Your Order']")
    private WebElement reviewYourOrderHeading;

    @FindBy(css="textarea[name='message']")
    private WebElement commentArea;

    @FindBy(css = "a[href='/payment']")
    private WebElement placeOrderButton;

    public PaymentPage clickPlaceOrder(){
        click(placeOrderButton);
        return new PaymentPage(driver);
    }
    public void enterTextAtCommentArea(String comment){
       set(commentArea,comment);
    }

    public String getDeliveryCityStateZip(){
        return deliveryCityStateZip.getText();
    }
    public String getDeliveryName() {
        return deliveryName.getText();
    }
    public String getDeliveryStreetCompanyAndBuilding() {
        return deliveryCompanyStreetAndBuilding.getText();
    }
    public String getStateAndPostCode() {
        return deliveryCityStateZip.getText();
    }

    public String getDeliveryCountry() {
        return deliveryCountry.getText();
    }
    public String getDeliveryPhone() {
        return deliveryPhone.getText();
    }
    public boolean isAddressDetailsVisible() {
        return addressDetails.isDisplayed();
    }
    public String getBillingAddressText() {
        return yourBillingAddressBlock.getText();
    }
    public boolean isReviewOrderSectionVisible() {
        return reviewYourOrderHeading.isDisplayed();
    }














}
