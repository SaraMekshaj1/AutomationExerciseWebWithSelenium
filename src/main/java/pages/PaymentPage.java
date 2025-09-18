package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="input[name='name_on_card']")
    WebElement nameOnCardField;

    @FindBy(css="input[data-qa='card-number']")
    WebElement cardNumberField;

    @FindBy(css="input[data-qa='cvc']")
    WebElement cvcField;

    @FindBy(css="input[data-qa='expiry-month']")
    WebElement expirationMonthField;


    @FindBy(css="input[data-qa='expiry-year']")
    WebElement expirationYearField;

    @FindBy(css="button[id='submit']")
    WebElement payAndConfirmOrderButton;

    @FindBy(css="div.col-sm-9  > p")
    WebElement congratulationOrderPlacedMessage;

    @FindBy(css="div.pull-right > a")
    WebElement continueButton;

    public void writeNameOnCard(String name){
        nameOnCardField.sendKeys(name);
    }
    public void writeCardNumber(String cardNumbers){
        cardNumberField.sendKeys(cardNumbers);
    }
    public void writeCvc(String cvc){
        cvcField.sendKeys(cvc);
    }
    public void writeExpirationMonth(String month){
        expirationMonthField.sendKeys(month);
    }
    public void writeExpirationYear(String year){
        expirationYearField.sendKeys(year);
    }

    public void clickPayAndConfirmOrder(){
          click(payAndConfirmOrderButton);
    }

    public boolean isCongratulationMessageForOrderPlacedVisible(){
        return congratulationOrderPlacedMessage.isDisplayed();
    }
    public void clickContinueButton(){
        click(continueButton);
    }


}
