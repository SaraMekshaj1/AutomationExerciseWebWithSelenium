package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import static utilities.ActionsUtility.hoverOverElement;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "h2.title.text-center")
    private WebElement allProductsH2;

    @FindBy(css = "a[href='/product_details/1']")
    private WebElement viewFirstProductBlueTop;

    @FindBy(css = "input[id='search_product']")
    private WebElement searchInputField;

    @FindBy(css = "button[id='submit_search']")
    private WebElement submitSearchButton;

    @FindBy(xpath = "//div[@class='single-products'][.//p[text()='Sleeveless Dress']]")
    private WebElement result1Sleeveless;

    @FindBy(xpath = "//div[@class='single-products'][.//p[text()='Sleeveless Unicorn Patch Gown - Pink']]")
    private WebElement result2Sleeveless;

    @FindBy(xpath = "//div[@class='single-products'][.//p[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']]")
    private WebElement result3Sleeveless;

    @FindBy(xpath = "//div[@class='productinfo text-center']/p[text()='Blue Top']")
    private WebElement blueTopProduct;

    @FindBy(xpath = "//button[contains(@class,'close-modal') and contains(text(),'Continue Shopping')]")
    private WebElement continueShoppingPopupButton;

    @FindBy(xpath = "//div[@class='productinfo text-center'][.//h2[text()='Rs. 500'] and .//p[contains(text(),'Blue Top')]]//a[@data-product-id='1' and contains(@class, 'add-to-cart')]")
    private WebElement addToCartBlueTop;

    @FindBy(xpath = "//div[@class='productinfo text-center']//p[text()='Men Tshirt']")
    private WebElement menTshirtProduct;

    @FindBy(xpath = "//div[@class='productinfo text-center'][.//h2[text()='Rs. 400'] and .//p[contains(text(),'Men Tshirt')]]//a[@data-product-id='2' and contains(@class, 'add-to-cart')]")
    private WebElement addToCartMenTshirt;

    @FindBy(css = "div[class='product-details']")
    private WebElement productDetails;

    @FindBy(css = "input[id='quantity']")
    private WebElement quantityProductDetails;

    @FindBy(css = "button[class='btn btn-default cart']")
    private WebElement addToCartButtonProductDetails;

    @FindBy(css = ".features_items .productinfo.text-center p")
    private List<WebElement> searchResultsTitles;

    public void addToCart() {
        click(addToCartButtonProductDetails);
    }

    public void setQuantityProductDetails(String quantity) {
        set(quantityProductDetails, quantity);
    }

    public boolean isProductDetailsVisible() {
        return productDetails.isDisplayed();
    }

    public boolean isAllProductH2textDisplayed() {
        return allProductsH2.isDisplayed();
    }

    public Product1BlueTop clickViewFirstProductBlueTop() {
        scrollToElementJS(driver,viewFirstProductBlueTop);
        click(viewFirstProductBlueTop);
        return new Product1BlueTop(driver);
    }

    public void searchProduct(String productName) {
        set(searchInputField, productName);
        click(submitSearchButton);
    }

    public boolean resultsSearchSleeveless() {
        return (result1Sleeveless.isDisplayed()
                && result2Sleeveless.isDisplayed()
                && result3Sleeveless.isDisplayed());
    }

    public List<String> getSearchResultTitles() {
        return searchResultsTitles.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

    public boolean doAllResultsContain(String keyword) {
        List<String> productTitles = getSearchResultTitles();
        for (String title : productTitles) {
            if (!title.toLowerCase().contains(keyword.toLowerCase().trim())) {
                System.out.println("FAILED: " + title);
                return false;
            }
        }
        return true;
    }

    public void hoverOverBlueTopProduct() {
        hoverOverElement(driver,blueTopProduct);
    }

    public void clickContinueButton() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(continueShoppingPopupButton));
        click(continueShoppingPopupButton);

    }


    public void hoverOverMenTshirtProduct() {
        waitUntilVisible(continueShoppingPopupButton, 3);
        hoverOverElement(driver,menTshirtProduct);
    }

    public void clickAddToCartMenTshirt() {
        scrollToElementJS(driver,addToCartMenTshirt);
        click(addToCartMenTshirt);
    }

    public void clickAddToCartBlueTop() {
        scrollToElementJS(driver,addToCartBlueTop);
        click(addToCartBlueTop);
    }
}
