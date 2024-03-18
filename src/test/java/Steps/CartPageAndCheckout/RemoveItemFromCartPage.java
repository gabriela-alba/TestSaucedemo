package Steps.CartPageAndCheckout;

import org.openqa.selenium.WebDriver;
import Hook.Hooks;
import io.cucumber.java.en.Then;
import pageObjectModel.CartPageAndCheckout;

public class RemoveItemFromCartPage {

	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
	
	CartPageAndCheckout cartPageAndCheckout = new CartPageAndCheckout(driver);

	@Then("User remove first item in cart")
	public void removeItemFromCart() {
		cartPageAndCheckout.clickRemoveItem();
    }
	
}
