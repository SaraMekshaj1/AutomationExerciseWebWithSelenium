package home;

import base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By slider= By.xpath("//section[@id='slider']");

    public boolean isSliderVisible(){
        return find(slider).isDisplayed();
    }

}
