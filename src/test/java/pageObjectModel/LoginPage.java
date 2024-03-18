package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hook.Hooks;

public class LoginPage {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    private WebElement box_username;
	
    @FindBy(id = "password")
    private WebElement box_password;
	
    @FindBy(id = "login-button")
    private WebElement btn_login;
    
    @FindBy(id = "react-burger-menu-btn")
    private WebElement btn_burgerMenu;
    
    @FindBy(css = "h3[data-test='error']")
    private WebElement error_msg;
    
	
    public boolean verifyOnLoginPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement visibElement = wait.until(ExpectedConditions.visibilityOf(box_username));
        return visibElement.isDisplayed();
    }
    
    public void setUsername(String username){
    	box_username.sendKeys(username);
    }

    public void setPassword(String password){
    	box_password.sendKeys(password);
    }
    
    public void clickBtnLogin(){
    	btn_login.click();
    }

    public boolean loginIsSuccessful(){
        return btn_burgerMenu.isDisplayed();
    }

    public String loginIsError(){
        return error_msg.getText();
    }

}
