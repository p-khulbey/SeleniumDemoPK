package utils;

import cucumber.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import static utils.BaseClass.baseInit;
import static utils.Constant.*;
import utils.BaseClass;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
public class Hooks extends BaseClass {

    @Before
    public static void initialization() throws InterruptedException{
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("enable-automation");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-browser-side-navigation");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("disable-infobars");
        //chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-features=EnableEphemeralFlashPermission");
        chromeOptions.addArguments("--no-sandbox");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
//        driver.get("http://automationexercise.com");
       // return driver;
    }

    @After
    public void tearDown() throws IOException {
        //scenario.write("Finished scenario");
//		System.out.println("Scenario is : "+scenario);
//		System.out.println("Scenario name is : "+scenario.getName());
//		System.out.println("Scenario name is : "+scenario.getStatus());
//        if(scenario.getStatus()=="failed") {
//            screenShotCatchBlockmERA(scenario.getName());
//        }
        driver.close();
//        driver.quit();
    }
}
