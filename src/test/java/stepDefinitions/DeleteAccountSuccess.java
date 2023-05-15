package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DeleteAccountSuccessPage;
import pages.HomePage;
import pages.PageforCommonElements;

public class DeleteAccountSuccess {
    DeleteAccountSuccessPage deleteAccountSuccessPage;
    PageforCommonElements pageforCommonElements;
    public DeleteAccountSuccess (){
        deleteAccountSuccessPage=new DeleteAccountSuccessPage();
        pageforCommonElements=new PageforCommonElements();
    }




    @When("^Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button$")
    public void verify_that_ACCOUNT_DELETED_is_visible_and_click_Continue_button() throws Throwable {
        Assert.assertTrue(deleteAccountSuccessPage.getAccountCreatedText());
        Assert.assertTrue(deleteAccountSuccessPage.getAccountCreated2Text());
        Assert.assertTrue(deleteAccountSuccessPage.getAccountCreated3Text());
        Assert.assertTrue(deleteAccountSuccessPage.getAccountCreatedPageContinueButton());
        pageforCommonElements.clickAccountCreatedPageContinueButton();
    }


}
