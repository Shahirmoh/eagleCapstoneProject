package pageObjectRepository;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageObject extends Base {
	
	
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'Shopping Cart')]")
				private WebElement shoppingCart;
			
	@FindBy(xpath="(//p[text()='Your shopping cart is empty!'])[2]")
	private WebElement displayMessage;
	
	@FindBy(xpath ="//span[contains(text(),'Currency')]")
	private WebElement currency;
	
@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement euro;
	
public void clickOncurrency() {
	WebDriverUtility.clickOnElement(currency);

}

public void selectEuro() {
	
	
	
		
		
		
		if(!euro.isSelected()) {
			WebDriverUtility.clickOnElement(euro);
		System.out.println("it is failed");
	}else {
		System.out.println("passed");
	}
	
	
	
}

public void validate() {
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	if(currency.isDisplayed()==true) {
		System.out.println("it is passed");
	}else {
		System.out.println("not selected");
	}
	
	
}

//public void clickOnPhoneNumber() {
//	WebDriverUtility.clickOnElement(phoneNumber);
//}
//
//public void clickOnMyAccount() {
//	WebDriverUtility.clickOnElement(myAccount);
//}
//
//public void clickOnWashList() {
//	WebDriverUtility.clickOnElement(washList);
//}
//
//
public void clickOnShoppingCart() {
	WebDriverUtility.clickOnElement(shoppingCart);
}

public String showMessage() {
	String message = displayMessage.getText();
	System.out.println("###################################################");
	System.out.println(message);
	return message;
}
//
//public void clickOnCheckOut() {
//	WebDriverUtility.clickOnElement(checkout);
//	
//}
//
//public void clickOnitems() {
//	WebDriverUtility.clickOnElement(items);
//}
//	
//	public void enteritmes(String item) {
//		WebDriverUtility.enterValue(searchBar, item);
//	}
//	
//	public void clickOnsearchButton() {
//		WebDriverUtility.clickOnElement(searchicon);;
//	}
}

