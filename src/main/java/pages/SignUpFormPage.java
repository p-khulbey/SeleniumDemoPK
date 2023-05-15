package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClass;
import static utils.CommonUtilities.selectDropDownValue;
public class SignUpFormPage extends BaseClass {

//    All Headers
    @FindBy(xpath="//*[text()='Enter Account Information']") public WebElement enterAccountInformationLabel;
    @FindBy(xpath="//input[@value='Mr']") public WebElement titleMrRadioButton;
    @FindBy(xpath="//input[@value='Mrs']") public WebElement titleMrsRadioButton;
    @FindBy(xpath="//input[@id='name']") public WebElement nameTextbox;
    @FindBy(xpath="//input[@id='name']") public WebElement emailTextbox;
    @FindBy(xpath="//input[@id='password']") public WebElement passwordTextbox;
    @FindBy(xpath="//select[@id='days']") public WebElement daysDropdown;
    @FindBy(xpath="//select[@id='months']") public WebElement monthDropdown;
    @FindBy(xpath="//select[@id='years']") public WebElement yearDropdown;
    @FindBy(xpath="//input[@name='newsletter']") public WebElement newsletterCheckbox;
    @FindBy(xpath="//input[@name='optin']") public WebElement specialOffersCheckbox;
    @FindBy(xpath="//*[text()='Address Information']") public WebElement addressInformationLabel;
    @FindBy(xpath="//input[@name='first_name']") public WebElement addressFirstNameTextbox;
    @FindBy(xpath="//input[@name='last_name']") public WebElement addressLastNameTextbox;
    @FindBy(xpath="//input[@name='company']") public WebElement companyTextbox;
    @FindBy(xpath="//input[@name='address1']") public WebElement address1Textbox;
    @FindBy(xpath="//input[@name='address1']") public WebElement address2Textbox;
    @FindBy(xpath="//select[@name='country']") public WebElement countryDropDown;
    @FindBy(xpath="//input[@name='state']") public WebElement stateTextbox;
    @FindBy(xpath="//input[@name='city']") public WebElement cityTextbox;
    @FindBy(xpath="//input[@name='zipcode']") public WebElement zipCodeTextbox;
    @FindBy(xpath="//input[@name='mobile_number']") public WebElement mobileNumberTextbox;
    @FindBy(xpath="//button[text()='Create Account']") public WebElement signupFormCreateAccountButton;

    public String getNameTextbox(){
    return nameTextbox.getAttribute("value");
}
    public String getEmailTextbox(){
        return emailTextbox.getAttribute("value");
    }
    public void setTitleToMr(){
        titleMrRadioButton.click();
    }
    public void setTitleToMrs(){
         titleMrsRadioButton.click();
    }
    public void setPassword(String password){
        passwordTextbox.sendKeys(password);
    }
    public void chooseDayFromDay(String value){
        selectDropDownValue(daysDropdown,value);
    }
    public void chooseMonthFromMonth(String value){
        selectDropDownValue(monthDropdown,value);
    }
    public void chooseYearFromYear(String value){
        selectDropDownValue(yearDropdown,value);
    }
    public void selectNewsletterCheckbox(){
        newsletterCheckbox.click();
    }
    public void selectSpecialOfferCheckbox(){
        specialOffersCheckbox.click();
    }
    public void setAddressFirstName(String addressFirstName){
        addressFirstNameTextbox.sendKeys(addressFirstName);
    }
    public void setAddressLastName(String addressLastName){
        addressLastNameTextbox.sendKeys(addressLastName);
    }
    public void setAddressCompany(String addressCompanyName){
        companyTextbox.sendKeys(addressCompanyName);
    }
    public void setAddress1(String address1){
        address1Textbox.sendKeys(address1);
    }
    public void setAddress2(String address2){
        address2Textbox.sendKeys(address2);
    }
    public void chooseCountry(String value){
        selectDropDownValue(countryDropDown,value);
    }
    public void setState(String state){
        stateTextbox.sendKeys(state);
    }
    public void setCity(String city){
        cityTextbox.sendKeys(city);
    }
    public void setAddressZipcode(String addressZipcode){
        zipCodeTextbox.sendKeys(addressZipcode);
    }
    public void setAddressMobileNumber(String addressMobileNumber){
        mobileNumberTextbox.sendKeys(addressMobileNumber);
    }
    public void clickCreateAccount(){
        signupFormCreateAccountButton.click();
    }
}
