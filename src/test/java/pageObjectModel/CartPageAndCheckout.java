package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Hook.Hooks;

public class CartPageAndCheckout {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();
	
	public CartPageAndCheckout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "shopping_cart_link")
    private WebElement btnCart;
	
	@FindBy(xpath = "//span[@class='title']")
    private WebElement verifyOnPage;
	
	@FindBy(xpath = "(//button[text()='Remove'])[1]")
    private WebElement removeBtn;
	
	@FindBy(id = "checkout")
    private WebElement checkout;
	
	@FindBy(id = "first-name")
    private WebElement firstNameCheckout;

    @FindBy(id = "last-name")
    private WebElement lastNameCheckout;

    @FindBy(id = "postal-code")
    private WebElement postalCode;
    
    @FindBy(id = "continue")
    private WebElement continueCheckout;
    
    @FindBy(xpath = "//div[@class='summary_subtotal_label']")
    private WebElement itemPrice;

    @FindBy(xpath = "//div[@class='summary_tax_label']")
    private WebElement taxPrice;

    @FindBy(xpath = "//div[@class='summary_info_label summary_total_label']")
    private WebElement totalPrice;
    
    @FindBy(id = "finish")
    private WebElement finish;
    
    @FindBy(id = "back-to-products")
    private WebElement backToProduct;
    
	public void clickCart(){
		btnCart.click();
    }
	
	public String verifyOnCartPage() {
        return verifyOnPage.getText();
    }
	
	public void clickRemoveItem(){
        removeBtn.click();
    }
	
	public void clickCheckout(){
        checkout.click();
    }
	
	public void setFirstName(String firstName){
        firstNameCheckout.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        lastNameCheckout.sendKeys(lastName);
    }

    public void setPostalCode(String postalCode){
        this.postalCode.sendKeys(postalCode);
    }
    
    public void clickContinue(){
        continueCheckout.click();
    }
    
    public String getItemPrice(){
        return itemPrice.getText();
    }

    public String getTaxPrice(){
        return taxPrice.getText();
    }

    public String getTotalPrice(){
        return totalPrice.getText();
    }
    
    public void clickFinish(){
        finish.click();
    }
	
    public void clickBackToProduct() {
        backToProduct.click();
    }

}
