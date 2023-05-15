package stepDefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SignUpFormPage;

public class SignupForm {
    SignUpFormPage signUpFormPage;
    public SignupForm() {
        signUpFormPage=new SignUpFormPage();
    }

    @When("^Verify that 'ENTER ACCOUNT INFORMATION' is visible$")
    public void verify_that_ENTER_ACCOUNT_INFORMATION_is_visible() throws Throwable {
        signUpFormPage.getNameTextbox();
        Assert.assertEquals(signUpFormPage.getNameTextbox(),"Lakhan sharma");
        Assert.assertEquals(signUpFormPage.getEmailTextbox(),"lakhansharma990@gmail.com");
    }

    @When("^Fill details: Title, Name, Email, Password, Date of birth$")
    public void fill_details_Title_Name_Email_Password_Date_of_birth() throws Throwable {
        signUpFormPage.setTitleToMr();
        signUpFormPage.setPassword("password");
        signUpFormPage.chooseDayFromDay("15");
        signUpFormPage.chooseMonthFromMonth("8");
        signUpFormPage.chooseYearFromYear("1991");
    }

    @When("^Select checkbox 'Sign up for our newsletter!'$")
    public void select_checkbox_Sign_up_for_our_newsletter() throws Throwable {
        signUpFormPage.selectNewsletterCheckbox();
    }

    @When("^Select checkbox 'Receive special offers from our partners!'$")
    public void select_checkbox_Receive_special_offers_from_our_partners() throws Throwable {
        signUpFormPage.selectSpecialOfferCheckbox();
    }
    @When("^Fill details: First name, Last name, Company, Address, Address(\\d+), Country, State, City, Zipcode, Mobile Number$")
    public void fill_details_First_name_Last_name_Company_Address_Address_Country_State_City_Zipcode_Mobile_Number(int arg1) throws Throwable {
        signUpFormPage.setAddressFirstName("lakhan");
        signUpFormPage.setAddressLastName("lakhan");
        signUpFormPage.setAddressCompany("lakhan");
        signUpFormPage.setAddress1("address1");
        signUpFormPage.setAddress2("address2");
        signUpFormPage.chooseCountry("India");
        signUpFormPage.setState("myState");
        signUpFormPage.setCity("myState");
        signUpFormPage.setAddressZipcode("122001");
        signUpFormPage.setAddressMobileNumber("9910487456");
    }

    @When("^Click 'Create Account button'$")
    public void click_Create_Account_button() throws Throwable {
        signUpFormPage.clickCreateAccount();
    }
}
