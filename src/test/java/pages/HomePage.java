package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	//Pagefactory
	
	@FindBy(xpath="//input[@name='searchbar']")
	WebElement srchbox;
	
	@FindBy(id="button-search")
	WebElement srchbutton;
	
	@FindBy(id="cart")
	WebElement cartBtn;
	
	
	public HomePage() {
	PageFactory.initElements(driver, this);
	
	}
	//Actions
	//login
	//signup
	//searchItem
	
	public void searchItem(String srtItem) {
		srchbox.sendKeys(srtItem);
		srchbutton.click();
	}
	
	//viewShoppingCart

}
