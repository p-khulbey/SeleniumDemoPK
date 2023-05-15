package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import static utils.CommonUtilities.scrollVerticalLast;

public class Home {
    HomePage homePage;
    public Home(){
        homePage = new HomePage();
    }


    @Given("^Verify that home page is visible successfully$")
    public void verify_that_home_page_is_visible_successfully() throws Throwable {
        Assert.assertTrue(homePage.gethomePageLogo());
        Assert.assertTrue(homePage.getHomePageHeader());
        Assert.assertTrue(homePage.getHomePageCategoryLebel());
        Assert.assertTrue(homePage.getHomepageFeaturesItemsLabel());
        Assert.assertTrue(homePage.getHomepageRecommendeItemsLabel());
        scrollVerticalLast();
        Assert.assertTrue(homePage.getHomePageFooterEmailPlaceholder());
        Assert.assertTrue(homePage.getHomePageFooterSubscriptionLabel());
    }
    @When("^Verify that 'Logged in as username' is visible$")
    public void verify_that_Logged_in_as_username_is_visible() throws Throwable {
        Assert.assertTrue(homePage.validateText("Lakhan sharma"));
    }
    @When("^Click 'Delete Account' button$")
    public void click_Delete_Account_button() throws Throwable {
        homePage.selectDeleteAccount();
    }
}
