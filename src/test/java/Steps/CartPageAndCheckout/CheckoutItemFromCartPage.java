package Steps.CartPageAndCheckout;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Hook.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjectModel.CartPageAndCheckout;

public class CheckoutItemFromCartPage {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
	CartPageAndCheckout cartPageAndCheckout = new CartPageAndCheckout(driver);
	
	@And("User navigate to cart page")
	public void navigateToCartPage() {
	    cartPageAndCheckout.clickCart();
	}

	@Then("User already on {string} as cart page")
	public void verifyOnCartPage(String msg) {
		Assert.assertEquals( msg, cartPageAndCheckout.verifyOnCartPage());
	}

	@And("User navigate to checkout page")
	public void navigateToCheckoutPage() {
		cartPageAndCheckout.clickCheckout();
    }

	@And("User filling {string} as firstName, {string} as lastName and {string} as postal code")
	public void inputCredentials(String firstname, String lastname, String code) {
		cartPageAndCheckout.setFirstName(firstname);
		cartPageAndCheckout.setLastName(lastname);
		cartPageAndCheckout.setPostalCode(code);
    }

	@And("User navigate to checkout overview page")
	public void navigateToCheckoutOverview() {
		cartPageAndCheckout.clickContinue();
    }

	@Then("User verify item total and tax price")
	public void verifyingPrice(){
        Float totalItemPrice = (Float.parseFloat(cartPageAndCheckout.getItemPrice().substring(13)) + Float.parseFloat(cartPageAndCheckout.getTaxPrice().substring(6)));

        Float totalPrice = Float.parseFloat(cartPageAndCheckout.getTotalPrice().substring(8));

        Assert.assertEquals(totalItemPrice, totalPrice);
    }

	@And("User navigate to checkout complete page and going back to home page")
	public void clickFinish() {
		cartPageAndCheckout.clickFinish();
		cartPageAndCheckout.clickBackToProduct();
    }




}
