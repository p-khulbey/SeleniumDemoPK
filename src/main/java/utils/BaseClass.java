package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
    public static WebDriver driver;
    public static JavascriptExecutor js;
    static Select select;
    public static String myString;
//    protected static StringBuffer username;
    public BaseClass (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    public static WebDriver baseInit(){
//        driver = new ChromeDriver();
//        return driver;
//    }
}
