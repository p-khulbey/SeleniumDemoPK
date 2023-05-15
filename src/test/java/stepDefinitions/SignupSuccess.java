package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignupSuccessPage;

public class SignupSuccess {
    SignupSuccessPage signupSuccessPage;
    public SignupSuccess(){
        signupSuccessPage=new SignupSuccessPage();
    }

    @When("^Verify that 'ACCOUNT CREATED!' is visible$")
    public void verify_that_ACCOUNT_CREATED_is_visible()  {
        Assert.assertTrue(signupSuccessPage.getAccountCreatedText());
        Assert.assertTrue(signupSuccessPage.getAccountCreated2Text());
        Assert.assertTrue(signupSuccessPage.getAccountCreated3Text());
        Assert.assertTrue(signupSuccessPage.getAccountCreatedPageContinueButton());
    }
}
