package stepDefinitions;


import org.testng.Assert;

import core.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopsAndNotebookPageDef extends Base {

	
	LaptopsNoteBooksPageObject Laptop=new LaptopsNoteBooksPageObject();
	
	
	@Given("^User is on Retail website$")
	public void user_on_Retail_Website() {
		openBrowser();
		
		logger.info("User Clicked on Retail Website");
		
	}
	
	@When("^User click on Laptop &NoteBook tab$")
	public void user_on_Laptops_And_Notebook() {
		
		Laptop.clickOnLaptopNotbook();
		logger.info("User Clicked on Laptops And NoteBook");
	}
	
	@And("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_ShowAll_Laptps_And_Notebook() {
		Laptop.clickOnAllLaptopNotbook();
		logger.info("User Clicked on ShowAllLaptopsAndNotebook");
	}
	

@And("^User click on MacBook  item$")
public void user_click_on_MacBook_item() {
	Laptop.clickOnMacBook();
	logger.info("User Clicked on MacBook item");
	
}
//@And("^User click add to Cart button$")
//public void user_click_add_to_Cart_button() {
//	Laptop.clickOnAddToCartButton();
//	logger.info("User Clicked on Add to Cart Button");
//	
//}

@And("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
public void user_should_see_a_message_Success_you_have_addes_MacBook_to_your_shopping_cart() {
	String expectedMessage="Success: You have added MacBook to your shopping cart!";
	String actualmessage = Laptop.showMacBookMessage();
	Assert.assertEquals(expectedMessage, actualmessage);
	WebDriverUtility.screenShot();
	logger.info("User should see a message");
	
}

@And("^User should see '1' tems-'602.00' showed to the cart$")
public void user_should_see_item_s_showed_to_the_cart() {
	String expectedMessage="1 item(s) - $602.00";
	String actualmessage = Laptop.showItemsMessage();
	Assert.assertEquals(actualmessage, expectedMessage);
	WebDriverUtility.screenShot();
	logger.info("User should see a meessage ");
	
}

@And("^User click on cart option$")
public void user_click_on_cart_option() {
	Laptop.clickOnItemsButton();
	logger.info("User Clicked on Cart Option");
	
}

@And("^user click on red X button to remove the item from cart$")
public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	Laptop.clickCloseButton();
	logger.info("User Clicked on Red X button");
	
}
@Then("^item should be removed and cart should show 0 item s$")
public void item_should_be_remove_and_cart_should_show_item() {
	
	String expectmessage="0 item(s) - $0.00";
	String actualmessage = Laptop.showRemoveditemMessage();
	Assert.assertEquals(actualmessage, expectmessage);
	WebDriverUtility.screenShot();
}
	
@And("^User click on product comparison icon on ‘MacBook’$")
public void user_click_on_product_comparison_icon_on_MacBook() {
	Laptop.clickOnmacBookcomprasionlink();
	logger.info("user clicked on comparison icon on MacBook");
	
}

@And("^User click on product comparison icon on ‘MacBook Air$")
public void user_click_on_product_comparison_icon_on_MacBook_Air() {
	Laptop.clickOnmacAirBookComprasionLink();
	logger.info("User Clicked on product comparison icon on MacBook Air");
	
	
}

@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
public void user_should_see_a_message() {
	
	String expectedMessage="Success: You have added MacBook to your product comparison!";
	
String actualMessage = Laptop.showComprasionMessage();
Assert.assertEquals(expectedMessage.contains("Success"), actualMessage.contains("Success"));
logger.info("User Should see a success message");
}

@And("^User click on Product comparison link$")
public void user_click_on_product_comparison_link() {
	
	Laptop.compareLink();
	logger.info("User clicked on Product comparison Link");
}
@And("^User should see Product Comparison Chart$")
public void user_should_see_Product_Comparison_Chart() {
WebDriverUtility.wait(5000);
Laptop.showTable();
WebDriverUtility.screenShot();
logger.info("User should see Product coparison chart");
}

@And("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
public void user_click_on_heath_icon_to_add_sony_VaIO_laptop_to_wish_list() {
	WebDriverUtility.wait(5000);
	Laptop.clickOnHearthIcon();
	logger.info("User Clicked On Hearth icon");
	
}

@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
public void user_should_get_a_message() {
	String expectedmessage="You must login or create an account to save Sony VAIO to your wish list!";
	String actualmessage = Laptop.showHearthMessage();
	Assert.assertEquals(actualmessage.contains("You must"), expectedmessage.contains("You must"));
	WebDriverUtility.screenShot();
	logger.info("User Should get a Message");
	
}

@And("^User click on ‘MacBook Pro’ item$")
public void user_click_on_MacBook_Pro_item() {
	Laptop.clickOnMacBookPro();
	logger.info("User Clicked on MacBook Pro");
	
}

//@Then("^User should see  $'2000.00' price tag is present on UI$")
@Then("^User should see  \\$'2000.00' price tag is present on UI$")
public void user_should_see_$_price_tag_is_present_on_UI()  {
	String expectedmessage="$2,000.00";
	String actualmessage = Laptop.priceTagMessage();
	Assert.assertEquals(actualmessage, expectedmessage);
	WebDriverUtility.screenShot();
	logger.info("User should see price Tag");
    
	
	
	
	

	
	
	
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

