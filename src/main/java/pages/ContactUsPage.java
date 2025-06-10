package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class ContactUsPage extends BasePage
{
    private By nameField =By.cssSelector("[data-qa='name']");
    private By emailField=By.cssSelector("[data-qa='email']");
    private By subjectField=By.cssSelector("[data-qa='subject']");
    private By messageField=By.cssSelector("[data-qa='message']");
    private By fileUpload=By.name("upload_file");
    private By submitButton=By.cssSelector("[data-qa=submit-button]");
    private By successfulSubmitMessage=By.cssSelector(".status.alert.alert-success");

    public void setName(String name){
     set(nameField,name);
    }

    public void setEmail(String email){
        set(emailField,email);
    }
    public void setSubject(String subject){
        set(subjectField,subject);
    }
    public void setMessage(String message){
        set(messageField,message);
    }

    public void uploadFile(String fileLocation){
        set(fileUpload,fileLocation);
    }

    public void clickSubmit(){
        click(submitButton);
    }
    public boolean isSuccessfulMessageSubmited(){
        return find(successfulSubmitMessage).isDisplayed();
    }
}
