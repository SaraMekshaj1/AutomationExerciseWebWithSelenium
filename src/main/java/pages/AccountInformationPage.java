package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pages.AccountCreatedPage;

import static utilities.DropDownUtility.selectByIndex;
import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class AccountInformationPage extends BasePage {



    public AccountInformationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='login-form']//b[text()='Enter Account Information']")
    private WebElement enterAccountInformation;

    @FindBy(id = "id_gender2")
    private WebElement titleMsrRadioButton;

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "days")
    private WebElement dayDropDown;

    @FindBy(id = "months")
    private WebElement monthDropDown;

    @FindBy(id = "years")
    private WebElement yearDropDown;

    @FindBy(id = "newsletter")
    private WebElement newsletterCheckBox;

    @FindBy(id = "optin")
    private WebElement receiveSpecialOffersCheckbox;

    @FindBy(id = "first_name")
    private WebElement firstNameField;

    @FindBy(id = "last_name")
    private WebElement lastNameField;

    @FindBy(id = "company")
    private WebElement companyField;

    @FindBy(id = "address1")
    private WebElement address1Field;

    @FindBy(id = "address2")
    private WebElement address2Field;

    @FindBy(id = "country")
    private WebElement countryDropDown;

    @FindBy(id = "state")
    private WebElement stateField;

    @FindBy(id = "city")
    private WebElement cityField;

    @FindBy(id = "zipcode")
    private WebElement zipCodeField;

    @FindBy(id = "mobile_number")
    private WebElement mobileNumberField;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;


    public boolean isEnterAccountInformationVisible() {
        return enterAccountInformation.isDisplayed();
    }

    public void clickTitleMsrRadioButton() {
        click(titleMsrRadioButton);
    }

    public boolean isMrsRadioButtonSelected() {
        return titleMsrRadioButton.isSelected();
    }

    public void setName(String name) {
        set(nameField, name);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public void selectDayDropDown(String text) {
        scrollToElementJS(driver,dayDropDown);
        selectByVisibleText(dayDropDown, text);
    }

    public void selectDayDropDown(int index) {
        scrollToElementJS(driver,dayDropDown);
        selectByIndex(dayDropDown, index);
    }

    public void selectMonthDropDown(String text) {
        scrollToElementJS(driver,monthDropDown);
        selectByVisibleText(monthDropDown, text);
    }

    public void selectMonthDropDown(int index) {
        scrollToElementJS(driver,monthDropDown);
        selectByIndex(monthDropDown, index);
    }

    public void selectYearDropDown(String text) {
        scrollToElementJS(driver,yearDropDown);
        selectByVisibleText(yearDropDown, text);
    }

    public void selectYearDropDown(int index) {
        scrollToElementJS(driver,yearDropDown);
        selectByIndex(yearDropDown, index);
    }

    public void clickNewsletterCheckBox() {
        if (!newsletterCheckBox.isSelected()) {
            click(newsletterCheckBox);
        }
    }

    public boolean isNewsLetterCheckBoxSelected() {
        return newsletterCheckBox.isSelected();
    }

    public void clickReceiveSpecialOffersCheckbox() {
        if (!receiveSpecialOffersCheckbox.isSelected()) {
            click(receiveSpecialOffersCheckbox);
        }
    }

    public boolean isReceiveSpecialOffersCheckboxSelected() {
        return receiveSpecialOffersCheckbox.isSelected();
    }

    public void setFirstName(String name) {
        set(firstNameField, name);
    }

    public void setLastName(String lastName) {
        set(lastNameField, lastName);
    }

    public void setCompanyName(String companyName) {
        set(companyField, companyName);
    }

    public void setAddress1(String address1) {
        set(address1Field, address1);
    }

    public void setAddress2Field(String address2) {
        set(address2Field, address2);
    }

    public void selectCountryDropDown(String text) {
        scrollToElementJS(driver,countryDropDown);
        selectByVisibleText(countryDropDown, text);
    }

    public void selectCountryDropDown(int index) {
        scrollToElementJS(driver,countryDropDown);
        selectByIndex(countryDropDown, index);
    }

    public void setState(String stateName) {
        set(stateField, stateName);
    }

    public void setCity(String city) {
        set(cityField, city);
    }

    public void setZipCode(String zipCode) {
        set(zipCodeField, zipCode);
    }

    public void setMobileNr(String mobileNr) {
        set(mobileNumberField, mobileNr);
    }

    public AccountCreatedPage clickCreateAccountButton() {
        scrollToElementJS(driver,createAccountButton);
        click(createAccountButton);
        return new AccountCreatedPage(driver);
    }



    public String getSelectedDay() {
        return new Select(dayDropDown).getFirstSelectedOption().getText();
    }

    public String getSelectedMonth() {
        return new Select(monthDropDown).getFirstSelectedOption().getText();
    }

    public String getSelectedYear() {
        return new Select(yearDropDown).getFirstSelectedOption().getText();
    }

}
