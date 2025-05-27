package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class AccountCreatedPage extends BasePage {
    private By accountCreatedText=By.xpath("//h2[@data-qa='account-created']/b");
    private By continueButton=By.xpath("//a[@data-qa='continue-button']");

    public String getPageText(){
        return find(accountCreatedText).getText();
    }
    public void clickContinueButton(){
        click(continueButton);
    }
}
