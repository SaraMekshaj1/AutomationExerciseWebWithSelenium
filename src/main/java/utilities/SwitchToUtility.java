package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility {
    public static String getAlertText(WebDriver driver) {
        return driver.switchTo().alert().getText();
    }

    public static void acceptAlert(WebDriver driver) {
        driver.switchTo().alert().accept();
    }

    public static void dismissAlert(WebDriver driver) {
        driver.switchTo().alert().dismiss();
    }

    public static void switchToFrame(WebDriver driver, int index) {
        driver.switchTo().frame(index);
    }

    public static void switchToDefault(WebDriver driver) {
        driver.switchTo().defaultContent();
    }
}
