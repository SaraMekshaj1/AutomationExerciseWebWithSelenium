package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility{
    public static void hoverOverElement(WebDriver driver, WebElement element) {
        new Actions(driver).moveToElement(element).perform();
    }

    public static void clickAndHold(WebDriver driver, WebElement element) {
        new Actions(driver).clickAndHold(element).perform();
    }

    public static void doubleClick(WebDriver driver, WebElement element) {
        new Actions(driver).doubleClick(element).perform();
    }

    public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        new Actions(driver).dragAndDrop(source, target).perform();
    }
}
