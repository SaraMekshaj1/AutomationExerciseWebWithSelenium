package pages;

import base.BasePage;
import home.HomePage;
import org.openqa.selenium.By;

public class DeleteAccountPage extends BasePage {

    private By accountDeletedMsg = By.xpath("//h2[@data-qa='account-deleted']/b");
    private By continueButton=By.xpath("//a[@data-qa='continue-button']");

    public boolean isAcoountDeletedMSGvisible() {
       return  find(accountDeletedMsg).isDisplayed();
    }

    public HomePage clickContinueButton(){
        click(continueButton);
        return new HomePage();
    }


}

