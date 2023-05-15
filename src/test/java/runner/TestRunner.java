package runner;

import java.io.File;
import java.io.IOException;

import com.vimalselvam.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

//https://stackoverflow.com/questions/25923405/exception-in-thread-main-cucumber-runtime-cucumberexception-no-backends-were
//https://www.google.com/search?q=cucumber.runtime.CucumberException%3A+No+backends+were+found.+Please+make+sure+you+have+a+backend+module+on+your+CLASSPATH.&ei=krFhZMz6HsOZjuMPqJ298AU&ved=0ahUKEwjMi6f-uvb-AhXDjGMGHahOD14Q4dUDCA8&uact=5&oq=cucumber.runtime.CucumberException%3A+No+backends+were+found.+Please+make+sure+you+have+a+backend+module+on+your+CLASSPATH.&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzITCAAQjwEQ6gIQtAIQjAMQ5QIYATITCC4QjwEQ6gIQtAIQjAMQ5QIYATITCAAQjwEQ6gIQtAIQjAMQ5QIYATITCAAQjwEQ6gIQtAIQjAMQ5QIYATITCAAQjwEQ6gIQtAIQjAMQ5QIYATITCAAQjwEQ6gIQtAIQjAMQ5QIYATITCC4QjwEQ6gIQtAIQjAMQ5QIYATITCAAQjwEQ6gIQtAIQjAMQ5QIYATITCC4QjwEQ6gIQtAIQjAMQ5QIYATITCAAQjwEQ6gIQtAIQjAMQ5QIYAUoECEEYAFD6BVj6BWDuEWgBcAB4AIABAIgBAJIBAJgBAKABAaABArABCsABAdoBBAgBGAo&sclient=gws-wiz-serp
@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json"
//,retryCount = 1wq
        ,detailedReport = true
        ,detailedAggregatedReport = true
        ,overviewReport = true
//,jsonUsageReport = "target/cucumber-usage.json"
        ,usageReport = true
        ,toPDF = true
//,includeCoverageTags = {"MWTrendingMxFdAllVerification"}
        ,outputFolder = "target")



@CucumberOptions(features = "src/test/java/features"
        , glue = { "src/test/java/stepDefinitions" }
        ,plugin = { //"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html",
//        ,plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/cucumber-report.json",

         //plugin = {
//                 "pretty", "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:path/report.html",
//        "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html",
        "rerun:target/rerun.txt"}
        , tags = {"@RegisterUser"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void setup() throws IOException { ///src/main/java/config/extent-config.xml
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir").toString() + File.separator+"src/main/java/" +"config"+File.separator+"extent-config.xml"));
        Reporter.setSystemInfo("User Name", "Prakash");
        Reporter.setSystemInfo("Application Name", " MomsPresso ");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.addScreenCaptureFromPath("/Users/prakash/intelliJWorkSpace/SeleniumDemoPK/DefectsScreenShots/abc.png");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }


}
