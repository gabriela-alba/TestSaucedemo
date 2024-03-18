package Hook;

import java.io.ByteArrayInputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import WebDriverFactory.WebDriverFactory;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;

public class Hooks {
	
	private static WebDriver driver;

	@Before
	public void openBrowser(){
         driver = WebDriverFactory.getDriver();
         WebDriverManager.chromedriver().clearDriverCache().setup();
         ChromeOptions option = new ChromeOptions();
         option.addArguments("--remote-allow-origins");
         String appUrl = "https://www.saucedemo.com/";
         driver.get(appUrl);
         driver.manage().window().maximize();
    }
	
	 @AfterStep
	public void addScreenShot(Scenario scenario){
		 if(scenario.isFailed()) {
			 byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			 Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));
		 }
	 }

     @AfterTest
     public void closeBrowser(){
        driver.quit();
     }
    
    public WebDriver getDriver() {
        return driver;
    }

}
