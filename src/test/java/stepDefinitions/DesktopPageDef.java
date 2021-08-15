package stepDefinitions;
import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pageObjectRepository.DestopsPageObject;
import utilites.WebDriverUtility;
public class DesktopPageDef extends Base {
	DestopsPageObject Desktop= new DestopsPageObject();
	
//	@Given("^User is on Retail Website$")
//	public void user_is_on_Retail_Website() {
//		openBrowser();
//		logger.info("Retail Website is open");
//	}
	
	@When("^User click on Desktops tab$")
	public void user_click_on_Desktop() {
		Desktop.clicOnDesktop();
		logger.info("user clicked on destop");
		
	}
	
@And("^User click on ShowAllDesktops$")
public void user_click_on_ShowAllDesktop() {
	Desktop.clickOnShowAllDesktop();
	logger.info("User clicked on ShowAllDestop");
	
}
	
	
@Then("^User should see all items are present in Desktop page$")
public void user_should_see_all_items_are_present_in_Desktop_page() {
WebDriverUtility.wait(5000);
WebDriverUtility.screenShot();
logger.info("user opened Desktop Page");
}
@And("^User click  ADD TO CART option on ‘HP LP3065’ item$")
public void user_click_ADD_TO_CART_option_on_HP_LP3065_item() {
	Desktop.clickOnAddToCart();
	logger.info("User Clicked on ADD TO CART Option");
}

@And("^User click  ADD TO CART option on ‘Canon EOS 5D’ item$")
	public void  user_click_ADD_TO_CART_option_on_Canon_EOS_5D_item() {
		Desktop.clickOnAddCanon();
		logger.info("User Cliked On Add to cart Canon 5D");
 
		
	}
@And("^User select color from dropdown ‘(.+)’$")
public void user_select_color_from_dropdown(String color) {
	Desktop.selectColor(color);
	logger.info("user selected red color from dropdown");
}

@And("^User select quantity '(.+)'$")
public void user_select_quantity( String quntity) throws InterruptedException {
	Thread.sleep(5000);
	Desktop.deletQuanity();
	Thread.sleep(5000);
	Desktop.selectQuantity(quntity);
	logger.info("User selected Quantity 1");
	
}
@And("^User click add to Cart button$")
public void user_click_add_to_Cart_button()  {
	Desktop.clickOnAddCartButton();
	logger.info("user clicked add to Cart Button");
	
}
@Then("^User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’$")
public void user_should_see_a_message_Success_you_have_addes_HP_LP_3065_to_your_Shoping_cart() throws InterruptedException {
	String expected="Success: you have added HP LP 3065 to your Shopping cart!";
	 String actualmessage =Desktop.shoppingSuccessMessage();
	  Assert.assertEquals(expected.contains("Success"), actualmessage.contains("Success"));
	Thread.sleep(5000);
	logger.info("User have added the item to shopping cart");
	WebDriverUtility.screenShot();
}
//@Then("^User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’$")
//public void user_should_see_a_message_Success_you_have_added_Canon_EOS_5D_to_your_Shoping_cart() throws InterruptedException {
//	String expected="Success: you have added HP LP 3065 to your Shopping cart!";
//	 String actualmessage =Desktop.CanonSuccessMesssage();
//	  Assert.assertEquals(expected.contains("Success"), actualmessage.contains("Success"));
//	Thread.sleep(5000);
//	logger.info("User have added Canon to Add cart");
//	WebDriverUtility.screenShot();
   	
@Then("^User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’$")
public void user_should_see_a_message_Success_you_have_added_Canon_EOS_5D_to_your_Shoping_cart() throws InterruptedException {
	String expected="Success: You have added Canon EOS 5D to your shopping cart!";
	 String actualmessage =Desktop.reviewSuccessMessage();
	  Assert.assertEquals(expected.contains("Success"), actualmessage.contains("Success"));
	Thread.sleep(5000);
	logger.info("User have added the item to shopping cart");
	WebDriverUtility.screenShot();
	
}

@And("^User click on Canon EOS 5D item$")
public void user_click_on_Canon_EOS_5D_item() {
	Desktop.clickOnCanonEOS5D();
	logger.info("User Clicked ON Canon EOS 5D item");
	
}

@And("^User click on write a review link$")
public void user_click_on_write_a_review_link() {
	Desktop.clickOnWrireReview();
	logger.info("User Clicked On Write Review");
	
}

@And("^user fill the review information with below information$")
public void user_fill_the_review_information_with_below_information(DataTable info) throws InterruptedException {
	Thread.sleep(5000);
	List<Map<String,String>> values= info.asMaps(String.class,String.class);
	Desktop.insertUserName(values.get(0).get("yourname"));
	Thread.sleep(5000);
	Desktop.writeReview(values.get(0).get("yourReview"));
	Thread.sleep(5000);
	Desktop.clickOnRating(values.get(0).get("Rating"));
	logger.info("user have filled out the form");
}

@And("^User click on Continue Button$")
public void user_click_on_Continue_Button() {
	Desktop.clickOnButton();
	logger.info("user clicked on continue button");
	
}
@And("^User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'$")
public void user_should_see_a_message_with_thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval() throws InterruptedException {
	String expectedmessage="Thank you for your review. It has been submitted to the webmaster for approval.";
	String actualmessage=Desktop.reviewSuccessMessage();
	Assert.assertEquals(expectedmessage, actualmessage);
	Thread.sleep(5000);
	WebDriverUtility.screenShot();
}
}


