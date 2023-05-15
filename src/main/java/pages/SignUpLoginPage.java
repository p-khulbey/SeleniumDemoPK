package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClass;

import java.util.List;

public class SignUpLoginPage extends BaseClass {

//    All Headers
    @FindBy(xpath="//*[text()='Login to your account']") public WebElement loginToYourAccountLabel;
    @FindBy(xpath="//*[text()='New User Signup!']") public WebElement signupAccountLabel;
    @FindBy(xpath="//input[@data-qa='login-email']") public WebElement loginToYourAccountEmailTextBox;
    @FindBy(xpath="//input[@placeholder='Password']") public WebElement loginToYourAccountPasswordTextBox;
    @FindBy(xpath="//input[@data-qa='signup-name']") public WebElement signupAccountEmailTextBox;
    @FindBy(xpath="//input[@placeholder='Name']") public WebElement signupAccountNameTextBox;
    @FindBy(xpath="//button[text()='Login']") public WebElement loginToYourAccountLoginButton;
    @FindBy(xpath="//button[text()='Signup']") public WebElement signupAccountSignupButton;




}
