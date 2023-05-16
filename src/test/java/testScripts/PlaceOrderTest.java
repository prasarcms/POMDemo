package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CheckOutPage;
import pages.HomePage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;

public class PlaceOrderTest extends TestBase{
	
	HomePage homePage;
	SearchResultPage resPage;
	ShoppingCartPage shpcartstPage;
	CheckOutPage chkoutPage;
  @BeforeTest
  public void setup() {
	initialize();  
  }
  @Test
  public void addItemTest() {
	//searchItem
	//addItemtocart
	  
	  homePage = new HomePage();
	  homePage.searchItem("Parry Hotter");
	  
	  resPage = new SearchResultPage();
	  resPage.viewItemDetails();
	  resPage.addToCart();
	  
	  
  }
  
  @Test
  public void checkOutTest() throws InterruptedException {
	  
	  shpcartstPage = new ShoppingCartPage();
	  shpcartstPage.clickCheckOut();
	//  shpcartstPage.clickEmptyCart();
	  chkoutPage = new CheckOutPage();
	  chkoutPage.nameItem("Prateek");
	  chkoutPage.surnameItem("SSS");
	  chkoutPage.addrItem("Vasanth Nagar");
	  chkoutPage.zipcItem("555555");
	  chkoutPage.cityItem("Bengaluru");
	  chkoutPage.companyItem("Test");
	  
	  
  }
  
 
  @AfterTest
  public void tearDown() {
	  closeBrowser();
  }
  
}
