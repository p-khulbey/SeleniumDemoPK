$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/RegisterUser.feature");
formatter.feature({
  "line": 1,
  "name": "Register User",
  "description": "I want to use this template for Register user",
  "id": "register-user",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user registration flow",
  "description": "",
  "id": "register-user;verify-user-registration-flow",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@RegisterUser"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "Launch browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Navigate to url \u0027http://automationexercise.com\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify that home page is visible successfully",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on \u0027Signup / Login\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify \u0027New User Signup!\u0027 is visible",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter name and email address",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click \u0027Signup\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Verify that \u0027ENTER ACCOUNT INFORMATION\u0027 is visible",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Fill details: Title, Name, Email, Password, Date of birth",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Select checkbox \u0027Sign up for our newsletter!\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select checkbox \u0027Receive special offers from our partners!\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click \u0027Create Account button\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify that \u0027ACCOUNT CREATED!\u0027 is visible",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click \u0027Continue\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Verify that \u0027Logged in as username\u0027 is visible",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Click \u0027Delete Account\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Verify that \u0027ACCOUNT DELETED!\u0027 is visible and click \u0027Continue\u0027 button",
  "keyword": "Then "
});
formatter.match({
  "location": "CommonStepdefinitions.launch_browser()"
});
formatter.result({
  "duration": 166325375,
  "error_message": "java.lang.ExceptionInInitializerError\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.ExtendedRuntime.runStep(ExtendedRuntime.java:319)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedExecutionUnitRunner.run(ExtendedExecutionUnitRunner.java:32)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedFeatureRunner.runChild(ExtendedFeatureRunner.java:99)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedFeatureRunner.runChild(ExtendedFeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.runChild(ExtendedCucumber.java:108)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.runChild(ExtendedCucumber.java:32)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.run(ExtendedCucumber.java:148)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n\tat ✽.Given Launch browser(src/test/java/features/RegisterUser.feature:7)\nCaused by: java.lang.reflect.InaccessibleObjectException: Unable to make field private final java.util.Comparator java.util.TreeMap.comparator accessible: module java.base does not \"opens java.util\" to unnamed module @12bb4df8\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:357)\n\tat java.base/java.lang.reflect.AccessibleObject.checkCanSetAccessible(AccessibleObject.java:297)\n\tat java.base/java.lang.reflect.Field.checkCanSetAccessible(Field.java:177)\n\tat java.base/java.lang.reflect.Field.setAccessible(Field.java:171)\n\tat cucumber.deps.com.thoughtworks.xstream.core.util.Fields.locate(Fields.java:39)\n\tat cucumber.deps.com.thoughtworks.xstream.converters.collections.TreeMapConverter.\u003cclinit\u003e(TreeMapConverter.java:50)\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.setupConverters(XStream.java:820)\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:574)\n\tat cucumber.deps.com.thoughtworks.xstream.XStream.\u003cinit\u003e(XStream.java:530)\n\tat cucumber.runtime.xstream.LocalizedXStreams$LocalizedXStream.\u003cinit\u003e(LocalizedXStreams.java:50)\n\tat cucumber.runtime.xstream.LocalizedXStreams.newXStream(LocalizedXStreams.java:37)\n\tat cucumber.runtime.xstream.LocalizedXStreams.get(LocalizedXStreams.java:29)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.ExtendedRuntime.runStep(ExtendedRuntime.java:319)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedExecutionUnitRunner.run(ExtendedExecutionUnitRunner.java:32)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedFeatureRunner.runChild(ExtendedFeatureRunner.java:99)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedFeatureRunner.runChild(ExtendedFeatureRunner.java:24)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.runChild(ExtendedCucumber.java:108)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.runChild(ExtendedCucumber.java:32)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat com.github.mkolisnyk.cucumber.runner.ExtendedCucumber.run(ExtendedCucumber.java:148)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:69)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)\n\tat com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)\n",
  "status": "failed"
});
formatter.match({
  "location": "CommonStepdefinitions.navigate_to_url_http_automationexercise_com()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Home.verify_that_home_page_is_visible_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.click_on_Signup_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.verify_New_User_Signup_is_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.enter_name_and_email_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Register.click_Signup_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupForm.verify_that_ENTER_ACCOUNT_INFORMATION_is_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupForm.fill_details_Title_Name_Email_Password_Date_of_birth()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupForm.select_checkbox_Sign_up_for_our_newsletter()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupForm.select_checkbox_Receive_special_offers_from_our_partners()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 62
    }
  ],
  "location": "SignupForm.fill_details_First_name_Last_name_Company_Address_Address_Country_State_City_Zipcode_Mobile_Number(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupForm.click_Create_Account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignupSuccess.verify_that_ACCOUNT_CREATED_is_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CommonStepdefinitions.click_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Home.verify_that_Logged_in_as_username_is_visible()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Home.click_Delete_Account_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DeleteAccountSuccess.verify_that_ACCOUNT_DELETED_is_visible_and_click_Continue_button()"
});
formatter.result({
  "status": "skipped"
});
});