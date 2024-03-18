package Steps.HomePage;

import org.openqa.selenium.WebDriver;

import Hook.Hooks;
import io.cucumber.java.en.And;
import pageObjectModel.HomePage;

public class AddItemToCart {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
    HomePage homePage = new HomePage(driver);
	
	@And("Add an {string} as an item to the cart")
	public void add_an_to_the_cart(String item) {
		homePage.clickAddToCart(item);
	}

}
