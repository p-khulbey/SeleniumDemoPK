package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BaseClass;

import java.util.List;

public class HomePage extends BaseClass {
    WebElement element;
//    username=new StringBuffer(myString) ;
//    All Headers
    @FindBy(xpath="//img[@alt='Automation Exercise website']") public WebElement homePageLogo;
    @FindBy(xpath="//*[text()=' Home']") public WebElement homeHeaderBarButton;
    @FindBy(xpath="//*[text()=' Products']") public WebElement productsHeaderBarButton;
    @FindBy(xpath="//*[text()=' Cart']") public WebElement cartHeaderBarButton;
    @FindBy(xpath="//*[text()=' Signup / Login']") public WebElement signUpLoginHeaderBarButton;
    @FindBy(xpath="//*[text()=' Test Cases']") public WebElement testCasesHeaderBarButton;
    @FindBy(xpath="//*[text()=' API Testing']") public WebElement APITestingHeaderBarButton;
    @FindBy(xpath="//*[text()=' Video Tutorials']") public WebElement VideoTutorialsHeaderBarButton;
    @FindBy(xpath="//*[text()=' Contact us']") public WebElement ContactUsHeaderBarButton;
    @FindBy(xpath="//*[text()='Category']") public WebElement homePageCategoryLebel;
    @FindBy(xpath="//*[text()='Features Items']") public WebElement homepageFeaturesItemsLabel;
    @FindBy(xpath="//*[text()='recommended items']") public WebElement homepageRecommendeItemsLabel;
    @FindBy(xpath="//a[text()='View Product']") public static List<WebElement> homepageAllProductsList;
    @FindBy(xpath="//a[text()=' Logged in as ']") public static WebElement loggedInAsText;
    @FindBy(xpath="//*[text()=' Delete Account']") public static WebElement deleteAccount;

    public String xpathBuilder(String name){
        String xpath = "//*[text()='userName']";
        return xpath.replace("userName",name);
}
    public boolean validateText(String name){
        element=driver.findElement(By.xpath(xpathBuilder(name)));
        return element.isDisplayed();
    }

    public void signUpLoginHeaderBarButton(){
        signUpLoginHeaderBarButton.click();
    }
    public void selectDeleteAccount(){
        deleteAccount.click();
    }

//    public static void verifyHomepageHeaders(){
//        homePageLogo.isDisplayed();
//        homeHeaderBarButton.isDisplayed();
//        homePageCategoryLebel.isDisplayed();
//        homepageFeaturesItemsLabel.isDisplayed();
//        homepageRecommendeItemsLabel.isDisplayed();
//
//    }

//    public static void verifyHomepageFooters() throws InterruptedException {
//        homePageLogo.isDisplayed();
//        scrollVerticalLast();
//        homePageFooterEmailPlaceholder.isDisplayed();
//        homePageFooterSubscriptionLabel.isDisplayed();
//    }

    public static int verifyProductsCount() throws InterruptedException {
        return homepageAllProductsList.size();
    }

    @FindBy(xpath="//*[text()='Subscription']") public static WebElement homePageFooterSubscriptionLabel;
    @FindBy(xpath="//input[@placeholder='Your email address']") public static WebElement homePageFooterEmailPlaceholder;

    public boolean gethomePageLogo(){
        return homePageLogo.isDisplayed();
    }
    public boolean getHomePageHeader(){
        return homeHeaderBarButton.isDisplayed();
    }
    public boolean getHomePageCategoryLebel(){
        return homePageCategoryLebel.isDisplayed();
    }
    public boolean getHomepageFeaturesItemsLabel(){
        return homepageFeaturesItemsLabel.isDisplayed();
    }
    public boolean getHomepageRecommendeItemsLabel(){
        return homepageRecommendeItemsLabel.isDisplayed();
    }
    public boolean getHomePageFooterEmailPlaceholder(){
        return homePageFooterEmailPlaceholder.isDisplayed();
    }
    public boolean getHomePageFooterSubscriptionLabel(){
        return homePageFooterSubscriptionLabel.isDisplayed();
    }


}
