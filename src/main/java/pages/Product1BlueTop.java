package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product1BlueTop extends BasePage {


    public Product1BlueTop(WebDriver driver) {
       super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Blue Top']")
    private WebElement product1Name;

    @FindBy(xpath = "//p[text()='Category: Women > Tops']")
    private WebElement product1Category;

    @FindBy(xpath = "//span[contains(text(),'Rs. 500')]")
    private WebElement product1Price;

    @FindBy(xpath = "//p[contains(text(),'In Stock')]")
    private WebElement product1Availability;

    @FindBy(xpath = "//p[contains(text(),'New')]")
    private WebElement product1Condition;

    @FindBy(xpath = "//p[contains(text(),'Polo')]")
    private WebElement product1Brand;

    public boolean isProduct1NameDisplayed() {
        return product1Name.isDisplayed();
    }

    public boolean isProduct1CategoryDisplayed() {
        return product1Category.isDisplayed();
    }

    public boolean isProduct1PriceVisible() {
        return product1Price.isDisplayed();
    }

    public boolean isProduct1Available() {
        return product1Availability.isDisplayed();
    }

    public boolean isProduct1ConditionVisible() {
        return product1Condition.isDisplayed();
    }

    public boolean isProduct1BrandVisible() {
        return product1Brand.isDisplayed();
    }
}
