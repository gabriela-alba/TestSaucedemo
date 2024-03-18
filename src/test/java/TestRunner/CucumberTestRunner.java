package TestRunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		tags = "@Login or @Cart or @Checkout or @Logout", 
		features = {"classpath:TestCases"},
		glue = {"classpath:Steps", "Hook"},
		plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests{

}
