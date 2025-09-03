package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_LoginPage extends BasePage {

    public Signup_LoginPage(WebDriver driver) {
       super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='signup-form']//h2[text()='New User Signup!']")
    private WebElement newUserSignUpTxt;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    private WebElement nameSignUpField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    private WebElement emailSignUpField;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    private WebElement signUpButton;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    private WebElement emailLoginField;

    @FindBy(xpath = "//input[@data-qa='login-password']")
    private WebElement passwordLoginField;

    @FindBy(xpath = "//button[@data-qa='login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//h2[text()='Login to your account']")
    private WebElement loginToYourAccountText;

    @FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
    private WebElement wrongCredentialsLoginMessage;

    @FindBy(xpath = "//p[text()='Email Address already exist!']")
    private WebElement emailAddressAlreadyExistMsg;


    public boolean isEmailAddressAlreadyExistMsgVisible() {
        return emailAddressAlreadyExistMsg.isDisplayed();
    }

    public boolean isNewUserSignUpTextVisible() {
        return newUserSignUpTxt.isDisplayed();
    }

    public boolean isLoginToYourAccountTextVisible() {
        return loginToYourAccountText.isDisplayed();
    }

    public void setNameAtSignUp(String name) {
        set(nameSignUpField, name);
    }

    public void setEmailAtSignUp(String email) {
        set(emailSignUpField, email);
    }

    public AccountInformationPage clickSignUpButton() {
        click(signUpButton);
        return new AccountInformationPage(driver);
    }

    public AccountInformationPage signUpIntoApplication(String name, String email) {
        setNameAtSignUp(name);
        setEmailAtSignUp(email);
        return clickSignUpButton();
    }

    public HomePage logIntoApplication(String email, String password) {
        set(emailLoginField, email);
        set(passwordLoginField, password);
        click(loginButton);
        return new HomePage(driver);
    }

    public String getWrongCredentialsLoginMessageText() {
        return wrongCredentialsLoginMessage.getText();
    }
}
