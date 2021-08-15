package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageObject;
import utilites.WebDriverUtility;

public class HomePageStepDef extends Base {
	
	
	HomePageObject home=new HomePageObject();
	
	
	
	@Given("^User user is on Retail Website$")
	public void user_click_on_HomePage() {
		openBrowser();
		logger.info("Retail Website is opened");
		WebDriverUtility.screenShot();
	}
	
	
//	@When("^User click on PhoneNumber$")
//	public void user_click_on_PhonNumber() {
//		home.clickOnPhoneNumber();
//		logger.info("user clicked on phone number");
//	}
//	
//	
//	@And("^User click on My Account$")
//	
//	public void user_click_on_My_Account() {
//		
//		home.clickOnMyAccount();
//		logger.info("user clicked on my account");
//	}
//	
//	@And("^User click on Wash List$")
//	
//	public void user_click_on_Wash_List() {
//		home.clickOnWashList();
//		logger.info("user clicked on wash list");
//	}
//	
	@And("^User click on shopping cart$")
	
	public void user_click_on_Shopping_Cart() {
		WebDriverUtility.wait(5000);
		home.clickOnShoppingCart();
		logger.info("user clicked on shopping cart");
	}
	
	@Then("^'Your shopping cart is empty!' message should display$")
	
	public void your_shopping_cart_is_empty() {
		String expectedmessage="Your shopping cart is empty!";
		String actualmessage=home.showMessage();
		Assert.assertEquals(actualmessage, expectedmessage);
		WebDriverUtility.screenShot();
	}
//	
//	@And("^User click on Checkout$")
//	
//	public void user_click_on_Checkout() {
//		home.clickOnCheckOut();
//		logger.info("user clicked on checkout");
//	}
//	
//	@And("^User click on item$")
//	
//	public void user_click_on_item() {
//		home.clickOnitems();
//		logger.info("user clicked on item ");
//	}
//	
//		
//		@And("^User type '(.+)' on search Bar$")
//		public void user_type_on_search_bar(String item) {
//			
//			home.enteritmes(item);
//		logger.info("user entered item iphne ");
//		WebDriverUtility.screenShot();
//		
//	}
//
//	
//	@And("^User click on seachButton$")
//	public void user_click_on_search_icon() {
//		
//		home.clickOnsearchButton();
//		logger.info("user clicked on search icom");
//		
//		
//	}
//	


	@When("^User click on Currency$")
	public void user_click_on_Currency() throws InterruptedException {
		//WebDriverUtility.wait(5000);
		Thread.sleep(5000);
		home.clickOncurrency();
		logger.info("user clicked on currency");
		
		
	}
	
	@And("^User Chose Euro from dropdown$")
	public void user_chose_Euro_from_dropdown() throws InterruptedException {
		//WebDriverUtility.wait(5000);
		Thread.sleep(5000);
		home.selectEuro();
		logger.info("User Chosed Euro from dropdown");
		
	}
	
	@Then("^currency value should change to Euro$")
	public void currency_value_should_change_to_Euro() throws InterruptedException {
		Thread.sleep(5000);
		home.validate();
		WebDriverUtility.screenShot();
		logger.info("Currency value changed");
	}
}

