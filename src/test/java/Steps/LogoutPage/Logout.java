package Steps.LogoutPage;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import Hook.Hooks;
import pageObjectModel.LogoutPage;

public class Logout {

    Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
    LogoutPage logoutPage = new LogoutPage(driver);

    @And("Click on burger menu")
    public void clickBurgerMenu() {
        logoutPage.clickBtnBurgerMenu();
    }    

    @And("Click on Logout")
    public void clickLogout() {
        logoutPage.clickBtnLogout();
    }    
}
