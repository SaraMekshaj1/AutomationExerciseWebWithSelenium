package utilities;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility extends Utility {

    private static Select findDropDown(WebElement element ){
        return new Select(element);
    }
    public static  String getFirstSelectedOption(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);
        return select.getFirstSelectedOption().getText();
    }

    public static void selectByVisibleText(WebElement element,String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }
    public static void selectByIndex(WebElement element,int index){
        Select select=new Select(element);
       select.selectByIndex(index);
    }
    public void selectByValue(WebElement dropdown, String value) {
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public static void deselectByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public List<String> getAllSelectedOptions(WebElement dropdown) {
        List<WebElement> allSelectedOptions = new Select(dropdown).getAllSelectedOptions();
        return allSelectedOptions.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
