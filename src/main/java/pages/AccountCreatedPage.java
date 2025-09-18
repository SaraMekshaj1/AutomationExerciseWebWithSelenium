package pages;
import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreatedPage extends BasePage {

    @FindBy(xpath = "//h2[@data-qa='account-created']/b")
    WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement  continueButton;

    public AccountCreatedPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public String getPageText(){
        return accountCreatedText.getText();
    }
    public void clickContinueButton(){
        click( continueButton);
    }
}
