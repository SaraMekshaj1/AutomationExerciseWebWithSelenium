package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccountPage extends BasePage {

    public DeleteAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@data-qa='continue-button']")
  WebElement accountDeletedMsg;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;

    public boolean isAccountDeletedMSGvisible() {
       return  accountDeletedMsg.isDisplayed();
    }

    public HomePage clickContinueButton(){
        click(continueButton);
        return new HomePage(driver);
    }


}

