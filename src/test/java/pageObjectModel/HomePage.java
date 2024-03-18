package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Hook.Hooks;

public class HomePage {
	
	Hooks hook = new Hooks();
	WebDriver driver = hook.getDriver();

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    
    public void clickAddToCart(String item) {
        driver.findElement(By.xpath("//*[text()='" + item + "']//ancestor::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']//button")).click();
    }

}
