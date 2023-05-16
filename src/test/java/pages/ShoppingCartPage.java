package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ShoppingCartPage extends TestBase{
	
	@FindBy(xpath = "//button[normalize-space()='Checkout']")
	WebElement cktButton;
	
	@FindBy(xpath = "//button[normalize-space()='Empty Cart']")
	WebElement emtButton;
	
	
	public ShoppingCartPage() {
		PageFactory.initElements(driver, this);
	}
	
	//view details
	public void clickCheckOut() throws InterruptedException {
		
		
		cktButton.click();
		Thread.sleep(2000);
		//driver.navigate().back();
		
		
	}
	
	public void clickEmptyCart() {
		
		emtButton.click();
		
	}
	
	
	
	
	

}
