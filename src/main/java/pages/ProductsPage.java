package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static utilities.ActionsUtility.hoverOverElement;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class ProductsPage extends BasePage {

    private By allProductsH2= By.cssSelector("h2.title.text-center");
    private By viewFirstProductBlueTop=By.cssSelector("a[href='/product_details/1'");
    private By searchInputField=By.cssSelector("input[id='search_product']");
    private By submitSearchButton=By.cssSelector("button[id='submit_search']");
    private By result1Sleveless=By.xpath("//div[@class='single-products'][.//p[text()='Sleeveless Dress']]");
    private By result2Sleeveless=By.xpath("//div[@class='single-products'][.//p[text()='Sleeveless Unicorn Patch Gown - Pink']]");
    private By result3Sleeveless=By.xpath("//div[@class='single-products'][.//p[text()='Sleeveless Unicorn Print Fit & Flare Net Dress - Multi']]");
    private By blueTopProduct=By.xpath("//div[@class='productinfo text-center']/p[text()='Blue Top']");
    private By continueShoppingPopupButton=By.xpath("//button[@class='btn btn-success close-modal btn-block']");
    private By addToCartBlueTop=By.xpath("//div[@class='productinfo text-center'][.//h2[text()='Rs. 500'] and .//p[contains(text(),'Blue Top')]]//a[@data-product-id='1' and contains(@class, 'add-to-cart')]");
    private By menTshirtProduct=By.xpath("//div[@class='productinfo text-center']//p[text()='Men Tshirt']");
    private By addToCartMentTshirt=By.xpath("//div[@class='productinfo text-center'][.//h2[text()='Rs. 400'] and .//p[contains(text(),'Men Tshirt')]]//a[@data-product-id='2' and contains(@class, 'add-to-cart')]");
    private By productDetails=By.cssSelector("div[class='product-details']");
    private By quantityProductDetails=By.cssSelector("input[id='quantity']");
    private By addToCardButtonProductDetails=By.cssSelector("button[class='btn btn-default cart']");

    public void addToCard(){
        click(addToCardButtonProductDetails);
    }

    public void setQuantityProductDetails(String quantity){
        set(quantityProductDetails,quantity);
    }

    public boolean isProductDetailsVisible(){
        return find(productDetails).isDisplayed();
    }

    public boolean isAllProductH2textDisplayed(){
        return find(allProductsH2).isDisplayed();
    }
    public  Product1BlueTop clickViewFirstProductBlueTop(){
        click(viewFirstProductBlueTop);
        return new Product1BlueTop();
    }
    public void searchProduct(String productName){
         set(searchInputField,productName);
         click(submitSearchButton);
    }
    public boolean resultsSearchSleeveless(){
        return (find(result1Sleveless).isDisplayed() &&
                find(result2Sleeveless).isDisplayed()&&
                find(result3Sleeveless).isDisplayed());
    }

    private By searchResultsTitles = By.cssSelector(".features_items .productinfo.text-center p");

    public List<String> getSearchResultTitles() {
        return findAll(searchResultsTitles).stream()
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

    public void hoverOverBlueTopProduct(){
        hoverOverElement(find(blueTopProduct));
    }

    public void clickAddToCardBlueTop(){
        scrollToElementJS(addToCartBlueTop);
        click(addToCartBlueTop);
    }
    public void clickContinueButton(){
        waitUntilVisible(continueShoppingPopupButton,3);
        click(continueShoppingPopupButton);
    }

    public void hoverOverMenTshirtProduct() {
        hoverOverElement(find((menTshirtProduct)));
    }
    public void clickAddToCardMenTshirt(){
        scrollToElementJS(addToCartMentTshirt);
        click(addToCartMentTshirt);
    }




}
