package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.By;

public class Signup_LoginPage extends BasePage {

    private By newUserSignUptxt = By.xpath("//div[@class='signup-form'] //h2[text()='New User Signup!']");
    private By nameSignUpField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By emailSignUpField = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By signUpButon = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    private By emailLoginField = By.xpath("//input[@data-qa='login-email']");
    private By passwordLoginFiled = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");
    private By loginToYourAccountText=By.xpath("//h2[text()='Login to your account']");
    private By wrongCredentialsLoginMessage=By.xpath("//p[text()='Your email or password is incorrect!']");


    public boolean isNewUserSingUpTextVisible() {
        return find(newUserSignUptxt).isDisplayed();
    }
    public boolean isLoginToYourAccountTextVisible(){
        return find(loginToYourAccountText).isDisplayed();
    }

    public void setNameAtSingUp(String name) {
        set(nameSignUpField, name);
    }

    public void setEmailAtSingUp(String email) {
        set(emailSignUpField, email);
    }

    public AccountInformationPage clickSignUpButton() {
        click(signUpButon);
        return new AccountInformationPage();
    }

    public AccountInformationPage signUpIntoApplication(String name, String email) {
        setNameAtSingUp(name);
        setEmailAtSingUp(email);
        return clickSignUpButton();
    }

    public HomePage logIntoApplication(String email, String password) {
        set(emailLoginField, email);
        set(passwordLoginFiled, password);
        click(loginButton);
        return new HomePage();
    }

    public String getWrongCredentialsLoginMessageText(){
        return find(wrongCredentialsLoginMessage).getText();
    }


}