package stepDefinitions;

import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SignUpLoginPage;

public class Register {
    HomePage homePage;
    SignUpLoginPage signUpLoginPage;
    public Register(){
        signUpLoginPage= new SignUpLoginPage();
        homePage=new HomePage();
    }
    @When("^Click on 'Signup / Login' button$")
    public void click_on_Signup_Login_button() throws Throwable {
        homePage.signUpLoginHeaderBarButton();
    }

    @When("^Verify 'New User Signup!' is visible$")
    public void verify_New_User_Signup_is_visible() throws Throwable {
        signUpLoginPage.loginToYourAccountLabel.isDisplayed();
        signUpLoginPage.signupAccountLabel.isDisplayed();
        signUpLoginPage.signupAccountNameTextBox.isDisplayed();
        signUpLoginPage.signupAccountSignupButton.isDisplayed();
    }

    @When("^Enter name and email address$")
    public void enter_name_and_email_address() throws Throwable {
        signUpLoginPage.signupAccountNameTextBox.sendKeys("Lakhan sharma");
        signUpLoginPage.signupAccountEmailTextBox.sendKeys("lakhansharma990@gmail.com");
    }
    @When("^Click 'Signup' button$")
    public void click_Signup_button() throws Throwable {
        signUpLoginPage.signupAccountSignupButton.click();
    }
}
