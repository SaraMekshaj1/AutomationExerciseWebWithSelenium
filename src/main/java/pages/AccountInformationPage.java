package pages;

import base.BasePage;
import org.openqa.selenium.By;

import static utilities.DropDownUtility.selectByIndex;
import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class AccountInformationPage extends BasePage {
    private By enterAccountInformation= By.xpath("//div[@class='login-form']//b[text()='Enter Account Information']");
    private  By titleMsrRadioButton=By.id("id_gender2");
    private By nameField=By.id("name");
    private By passwordField=By.id("password");
    private By dayDropDown=By.id("days");
    private By monthDropDown=By.id("months");
    private By yearDropDown=By.id("years");
    private By newsletterCheckBox=By.id("newsletter");
    private By receiveSpecialOffersCheckbox=By.id("optin");
    private By first_nameField=By.id("first_name");
    private By last_nameField=By.id("last_name");
    private By companyFiled=By.id("company");
    private By address1Field=By.id("address1");
    private By address2Field=By.id("address2");
    private By countryDropDown=By.id("country");
    private By stateField=By.id("state");
    private By cityField=By.id("city");
    private By zipCodeField=By.id("zipcode");
    private By mobileNumberField=By.id("mobile_number");
    private By createAccountButton=By.xpath("//button[text()='Create Account']");



    public boolean isEnterAccountInformationVisible(){
        return find(enterAccountInformation).isDisplayed();
    }
    public void clickTitleMsrRadioButton(){
        click(titleMsrRadioButton);
    }
    public boolean isMrsRadioButtonSelected(){
        return find(titleMsrRadioButton).isSelected();
    }
    public void setName(String name){
        set(nameField,name);
    }
    public void setPassword(String password){
        set(passwordField,password);
    }
    public void selectDayDropDown(String text){
        scrollToElementJS(dayDropDown);
        selectByVisibleText(dayDropDown,text);
    }
    public void selectDayDropDown(int index){
        scrollToElementJS(dayDropDown);
        selectByIndex(dayDropDown,index);
    }

    public void selectMonthDropDown(String text){
        scrollToElementJS(monthDropDown);
        selectByVisibleText(monthDropDown,text);
    }

    public void selectMonthDropDown(int index){
        scrollToElementJS(monthDropDown);
        selectByIndex(monthDropDown,index);
    }

    public void selectYearDropDown(String text){
        scrollToElementJS(yearDropDown);
        selectByVisibleText(yearDropDown,text);
    }
    public void selectYearDropDown(int index){
        scrollToElementJS(yearDropDown);
        selectByIndex(yearDropDown,index);
    }


    public void clickNewsletterCheckBox(){
        if(!find(newsletterCheckBox).isSelected()){
            click(newsletterCheckBox);
        }
    }
    public boolean isNewsLetterCheckBoxSelected(){
        return find(newsletterCheckBox).isSelected();
    }
    public void clickreceiveSpecialOffersCheckbox(){
        if(!find(receiveSpecialOffersCheckbox).isSelected()){
            click(receiveSpecialOffersCheckbox);
        }
    }
    public boolean isReceiveSpecialOffersCheckboxSelected(){
        return find(receiveSpecialOffersCheckbox).isSelected();
    }
    public void setFirstName(String name){
        set(first_nameField,name);
    }
    public void setLast_name(String lastName){
        set(last_nameField,lastName);
    }
    public void setCompanyName(String companyName){
        set(companyFiled, companyName);
    }
    public void setAddress1(String address1){
        set(address1Field,address1);
    }
    public void setAddress2Field(String address2){
        set(address2Field,address2);
    }
    public void selectCountryDropDown(String text){
        scrollToElementJS(countryDropDown);
        selectByVisibleText(countryDropDown,text);
    }
    public void selectCountryDropDown(int index){
        scrollToElementJS(countryDropDown);
        selectByIndex(countryDropDown,index);
    }
    public void setState(String stateName){
        set(stateField, stateName);
    }
    public void setCity(String city){
        set(cityField,city);
    }
    public void setZipCode(String zipCode){
        set(zipCodeField,zipCode);
    }
    public void setMobileNr(String mobileNr){
        set(mobileNumberField,mobileNr);
    }
    public AccountCreatedPage clickCreateAccountButton(){
        scrollToElementJS(createAccountButton);
        click(createAccountButton);
        return new AccountCreatedPage();
    }







}
