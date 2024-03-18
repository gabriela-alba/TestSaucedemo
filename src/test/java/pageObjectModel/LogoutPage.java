package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hook.Hooks;

public class LogoutPage {

    Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();

    public LogoutPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "react-burger-menu-btn")
    private WebElement btn_burgerMenu;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    private WebElement btn_logout;

    public void clickBtnBurgerMenu(){
    	btn_burgerMenu.click();
    }

    public void clickBtnLogout(){
        // Desplazar el elemento al centro de la vista utilizando JavaScriptExecutor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", btn_logout);
        // Esperar para que el desplazamiento se haya completado
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btn_logout.click();
        
    }

}
