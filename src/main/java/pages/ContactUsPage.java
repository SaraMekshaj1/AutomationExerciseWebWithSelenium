package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {


    public ContactUsPage(WebDriver driver) {
       super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "[data-qa='name']")
    private WebElement nameField;

    @FindBy(css = "[data-qa='email']")
    private WebElement emailField;

    @FindBy(css = "[data-qa='subject']")
    private WebElement subjectField;

    @FindBy(css = "[data-qa='message']")
    private WebElement messageField;

    @FindBy(name = "upload_file")
    private WebElement fileUpload;

    @FindBy(css = "[data-qa=submit-button]")
    private WebElement submitButton;

    @FindBy(css = ".status.alert.alert-success")
    private WebElement successfulSubmitMessage;


    public void setName(String name) {
        set(nameField, name);
    }

    public void setEmail(String email) {
        set(emailField, email);
    }

    public void setSubject(String subject) {
        set(subjectField, subject);
    }

    public void setMessage(String message) {
        set(messageField, message);
    }

    public void uploadFile(String fileLocation) {
        set(fileUpload, fileLocation);
    }

    public void clickSubmit() {
        click(submitButton);
    }

    public boolean isSuccessfulMessageSubmitted() {
        return successfulSubmitMessage.isDisplayed();
    }
}
