package pageObjectRepository;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilites.WebDriverUtility;
public class DestopsPageObject extends Base {
	
	public  DestopsPageObject() {
	PageFactory.initElements(driver, this);
	
	}
	
@FindBy(xpath ="//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	
	private WebElement desktop;
	
	
@FindBy(xpath ="//a[contains(text(),'Show All Desktops')]")
private WebElement showAlldesktop;
@FindBy(xpath ="(//span[text()='Add to Cart'])[3]")
private WebElement addToCart;
@FindBy(id="input-quantity")
private WebElement Addquantity;
@FindBy(id ="button-cart")
private WebElement addCartButton;
@FindBy(xpath="(//span[text()='Add to Cart'])[2]")
private WebElement addCanon;
@FindBy(id ="input-option226")
private WebElement select;
@FindBy(xpath="//div[text()='Success: You have added ']")
private WebElement successMessage;

@FindBy(xpath ="//div[text()='Success: You have added ']")
private WebElement canonSuccessMessage;

@FindBy(xpath="//a[text()='Write a review']")
private WebElement writeReview;

@FindBy(id="input-name")
private WebElement userName;

@FindBy(id="input-review")
private WebElement yourReview;

@FindBy(xpath="(//input[@type='radio'])[1]")
private WebElement badRating;

@FindBy(id="button-review")
private WebElement contineButton;

@FindBy(xpath="//a[text()='Canon EOS 5D']")
private WebElement clickOnCanonEOS5D;

@FindBy(xpath=" //div[@class='alert alert-success alert-dismissible']")
private WebElement reviewSuccessMessage;

@FindBy(xpath=" (//input[@type='radio'])[5]")
private WebElement goodRating;

public void clicOnDesktop() {
	WebDriverUtility.clickOnElement(desktop);
}
public void clickOnShowAllDesktop() {
	WebDriverUtility.clickOnElement(showAlldesktop);
}
public void clickOnAddToCart() {
	WebDriverUtility.clickOnElement(addToCart);
}
public void deletQuanity() {
	WebDriverUtility.clearText(Addquantity);
	
}
public void selectQuantity(String qty) {
	WebDriverUtility.enterValue(Addquantity, qty);
}
public void clickOnAddCartButton() {
	WebDriverUtility.clickOnElement(addCartButton);
}
public void clickOnAddCanon() {
	WebDriverUtility.clickOnElement(addCanon);
}
public void selectColor(String color) {
	WebDriverUtility.selectByVisibleText(select, color);
}
public String shoppingSuccessMessage() {
	
	System.out.println(successMessage.getText().length() + "================================ length");
		String message=successMessage.getText().trim().substring(0, 56);
		System.out.println(message);
		return message;
	
}

public String CanonSuccessMesssage() {
	
	String message = canonSuccessMessage.getText();
	return message;
}



public void clickOnWrireReview() {
	WebDriverUtility.clickOnElement(writeReview);
}

public void insertUserName(String Name) {
	WebDriverUtility.enterValue(userName, Name);
}

public void writeReview(String review) {
	WebDriverUtility.enterValue(yourReview, review);
}
	public void clickOnRating(String rating) {
		if(rating.equalsIgnoreCase("Bad")) {
		if(!badRating.isSelected()) 
			
		WebDriverUtility.clickOnElement(badRating);
		}else 
		if(!goodRating.isSelected()) 
			WebDriverUtility.clickOnElement(goodRating);
	}
	
public void clickOnButton() {
	WebDriverUtility.clickOnElement(contineButton);
}

public void clickOnCanonEOS5D() {
	WebDriverUtility.clickOnElement(clickOnCanonEOS5D);
}

public String reviewSuccessMessage() {
	System.out.println(reviewSuccessMessage.getText().length());
	String message = reviewSuccessMessage.getText();
	System.out.println(message);
	
	return message;
}
}

//public String CanonSuccessMessage() {
//	String message = CanonSuccessMessage.getText();
//	return message;
//
