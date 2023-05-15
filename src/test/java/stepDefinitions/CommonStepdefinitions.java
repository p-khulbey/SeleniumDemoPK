package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.PageforCommonElements;
import utils.BaseClass;

public class CommonStepdefinitions extends BaseClass {
PageforCommonElements pageforCommonElements;
    public CommonStepdefinitions() {
        pageforCommonElements=new PageforCommonElements();
    }
    @Given("^Launch browser$")
    public void launch_browser() throws Throwable {
        driver.get("http://automationexercise.com");
    }

    @Given("^Navigate to url 'http://automationexercise\\.com'$")
    public void navigate_to_url_http_automationexercise_com() throws Throwable {
      //  driver.get("http://automationexercise.com");
    }

    @When("^Click 'Continue' button$")
    public void click_Continue_button() throws Throwable {
        pageforCommonElements.clickAccountCreatedPageContinueButton();
    }
}
