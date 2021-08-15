package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class LaptopsNoteBooksPageObject extends Base {
	
	public LaptopsNoteBooksPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//a[text()='Laptops & Notebooks']")
	
	private WebElement laptopNotebook;
	
	
	@FindBy(xpath ="//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopNoteBook;
	
	@FindBy(xpath="//a[text()='MacBook']")
	private WebElement macBook;
	
	@FindBy(id="button-cart")
	private WebElement addToCartButton;
	
	@FindBy(xpath ="//div[text()='Success: You have added ']")
	private WebElement macBookSuccessMessage;
	
	@FindBy(id="cart-total")
	private WebElement itemsShow;
	
	@FindBy(xpath="//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement itemsButton;
	
	@FindBy(xpath ="//button[@class='btn btn-danger btn-xs']")
	private WebElement closeButton;
	
	@FindBy(xpath="//span[text()=' 0 item(s) - $0.00']")
	private WebElement removeMessage;
	
	
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[2]")
	
	private WebElement macBookcomprasionbutton;
	
	@FindBy(xpath="(//i[@class='fa fa-exchange'])[3]")
	
	private WebElement macBookAirComprasionButton;
	
	
@FindBy(xpath ="//div[text()=' Success: You have added ']")

	
	private WebElement comprasionMessage;
	
@FindBy(id="compare-total")
private WebElement compareLink;

@FindBy(xpath ="//table[@class='table table-bordered']")
private WebElement table;
	

@FindBy(xpath="(//i[@class='fa fa-heart'])[6]")



private WebElement hearthIcon;

@FindBy(xpath="//div[text()=' You must ']")
private WebElement hearthIconSuccessMessage;

@FindBy(xpath="//a[text()='MacBook Pro']")
private WebElement clickOnMacBookPro;


@FindBy(xpath="//h2[text()='$2,000.00']")
private WebElement priceTagmessage;


	public void clickOnLaptopNotbook() {
		WebDriverUtility.clickOnElement(laptopNotebook);
	}
	
	public void clickOnAllLaptopNotbook() {
		WebDriverUtility.clickOnElement(showAllLaptopNoteBook);
	}

	public void clickOnMacBook() {
		
		WebDriverUtility.clickOnElement(macBook);
	}
	
	public void clickOnAddToCartButton() {
		
		WebDriverUtility.clickOnElement(addToCartButton);
	}
	
	public String showMacBookMessage() {
		String message = macBookSuccessMessage.getText().substring(0, 54);
		System.out.println(message);
		return message;
	}
	
	public String showItemsMessage() {
		String message = itemsShow.getText();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println(itemsShow.getText());
		return message;
	}
	
	public void clickOnItemsButton() {
		WebDriverUtility.clickOnElement(itemsButton);
	}
	
	public void clickCloseButton() {
		WebDriverUtility.clickOnElement(closeButton);
	}
	
	public String showRemoveditemMessage() {
		String message = removeMessage.getText();
		System.out.println("______________________");
		System.out.println(message);
		return message;
	}
	
	public void clickOnmacBookcomprasionlink() {
		WebDriverUtility.clickOnElement(macBookcomprasionbutton);
	}
	
	public void clickOnmacAirBookComprasionLink() {
		WebDriverUtility.wait(5000);
		WebDriverUtility.clickOnElement(macBookAirComprasionButton);
	}
	
	public String showComprasionMessage() {
		String message = comprasionMessage.getText();
		System.out.println(message);
		return message;
	}
	
	public void compareLink() {
		WebDriverUtility.clickOnElement(compareLink);
		
	}
	
	public void showTable() {
		WebDriverUtility.wait(5000);
		if(table.isDisplayed()){
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
	}
	
	public void clickOnHearthIcon() {
		
		WebDriverUtility.clickOnElement(hearthIcon);
		
	}
	
	public String showHearthMessage() {
		String message = hearthIconSuccessMessage.getText();
		System.out.println(message);
		return message;
	}
	
	public void clickOnMacBookPro() {
		WebDriverUtility.clickOnElement(clickOnMacBookPro);
	}
	
	public String priceTagMessage() {
		String message = priceTagmessage.getText();
		System.out.println(message);
		return message;
	}
}

	
	
	
	

