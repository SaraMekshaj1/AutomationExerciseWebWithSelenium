package home;

import base.BasePage;
import org.openqa.selenium.By;
import pages.DeleteAccountPage;
import pages.ProductsPage;
import pages.Signup_LoginPage;

public class HomePage extends BasePage {

    private By slider= By.xpath("//section[@id='slider']");
    private By loginSigninHomeButton = By.xpath("//a[@href='/login']");
    private By logedAsNAME=By.xpath("//a[contains(., 'Logged in as') and .//b[text()='Sara']]");
    private By deleteAccountButton=By.xpath("//a[@href='/delete_account']");
    private By logoutButton=By.xpath("//a[@href='/logout']");
    private By productsNavBarButton=By.xpath("//a[@href='/products']");
    private By cartNavBarButton=By.xpath("//a[@href='/view_cart']");

    public boolean isSliderVisible(){
        return find(slider).isDisplayed();
    }
    public Signup_LoginPage clickSignLoginPage() {
        click(loginSigninHomeButton);
        return new Signup_LoginPage();
    }

    public ProductsPage goToProductsPage(){
        click(productsNavBarButton);;
        return new ProductsPage();
    }

public DeleteAccountPage clickDeleteButton(){
        click(deleteAccountButton);
        return new DeleteAccountPage();
}
    public String getLoginInAsText(){
        return find(logedAsNAME).getText();
    }
    public boolean isDeleteButtonVisible(){
        return find(deleteAccountButton).isDisplayed();
    }
    public Signup_LoginPage clickLogOut(){
        click(logoutButton);
        return new Signup_LoginPage();
    }



}
