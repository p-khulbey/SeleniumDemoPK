package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClass;

public class PageforCommonElements extends BaseClass {

    @FindBy(xpath="//a[text()='Continue']") public WebElement accountCreatedPageContinueButton;
    public boolean getAccountCreatedPageContinueButton() {
        return accountCreatedPageContinueButton.isDisplayed();
    }
    public void clickAccountCreatedPageContinueButton() {
         accountCreatedPageContinueButton.click();
    }

}
