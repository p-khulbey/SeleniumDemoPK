package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utils.BaseClass.driver;

public class CommonUtilities extends BaseClass {

    public static void scrollTillElement(WebElement PathToElement) throws InterruptedException {
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", PathToElement);
    }

    public static void scrollVerticalLast() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public static void ScrollVerticallyDown(double scrollPoint) throws Throwable {
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + scrollPoint + ")", "");
    }

    public static void selectDropDownValue(WebElement element,String value){
        select=new Select(element);
        select.selectByValue(value);
    }
}
