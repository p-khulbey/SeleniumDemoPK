package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClass;

public class DeleteAccountSuccessPage extends BaseClass {
    @FindBy(xpath="//*[text()='Account Deleted!']") public WebElement accountCreatedText;
    @FindBy(xpath="//*[text()='Your account has been permanently deleted!']") public WebElement accountCreated2Text;
    @FindBy(xpath="//*[text()='You can create new account to take advantage of member privileges to enhance your online shopping experience with us.']") public WebElement accountCreated3Text;

    @FindBy(xpath="//a[text()='Continue']") public WebElement accountCreatedPageContinueButton;
    public boolean getAccountCreatedText() {
        return accountCreatedText.isDisplayed();
    }
    public boolean getAccountCreated2Text() {
        return accountCreated2Text.isDisplayed();
    }
    public boolean getAccountCreated3Text() {
        return accountCreated3Text.isDisplayed();
    }
    public boolean getAccountCreatedPageContinueButton() {
        return accountCreatedPageContinueButton.isDisplayed();
    }
    public void clickAccountCreatedPageContinueButton() {
         accountCreatedPageContinueButton.click();
    }

}
