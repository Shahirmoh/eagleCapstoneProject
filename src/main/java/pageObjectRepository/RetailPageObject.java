package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class RetailPageObject extends Base{
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath ="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath ="//a[text()='Register for an affiliate account']")
	
	 private WebElement affiliateAccount;
	
	@FindBy(id="input-company")
	private WebElement company;
	
	@FindBy(id="input-website")
	private WebElement website;
	
	@FindBy(id="input-tax")
	private WebElement taxID;
	
	@FindBy(xpath="//input[@value='cheque']")
	private WebElement paymentMethod;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement aboutUs;
	
	@FindBy(xpath="//input[@value='Continue']")
 private WebElement coninueButton;
	
	
	@FindBy(id="input-cheque")
	private WebElement ChequePayeeName;
	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement successMessage;
	
	@FindBy(xpath="//a[contains(text(),'Edit your affiliate information')]")
	private WebElement Editinfomation;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(id="input-bank-name")
	private WebElement bankname;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement bankbranchnumber;
	
	@FindBy(id="input-bank-swift-code")
	private WebElement inputbankswiftcode;
	
	@FindBy(id="input-bank-account-name")
	private WebElement inputbankaccountname;
	
	@FindBy(id="input-bank-account-number")
	private WebElement inputbankaccountnumber;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Cointinue;
	
	@FindBy(xpath="//div[text()=' Success: Your account has been successfully updated.']")
	private WebElement editSuccessMessage;

	
	
	public void clickOnMyAccount() {
		WebDriverUtility.clickOnElement(myAccount);
	}
	
	public void clickOnLogin() {
		WebDriverUtility.clickOnElement(login);
	}
	
	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}
	
	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);
	}
	
	public void clickOnLoginButton() {
		WebDriverUtility.clickOnElement(loginButton);
	}
	
	public void clickOnAffiliateAccount() {
		
		WebDriverUtility.clickOnElement(affiliateAccount);
		
	}
	
	public void enterCompany(String companyName) {
		WebDriverUtility.enterValue(company, companyName);
	}
	
	public void enterWebsite(String wName) {
		WebDriverUtility.enterValue(website, wName);
	}
	
	public void enterTaxID(String tID) {
		WebDriverUtility.enterValue(taxID, tID);
	}
	
	public void enterChequeName(String ChName) {
		WebDriverUtility.enterValue(ChequePayeeName, ChName);
		
	}
	public void paymentMethod(String pMethod) {
		if (pMethod.equalsIgnoreCase("cheque")) {
			if (!ChequePayeeName.isSelected())
				WebDriverUtility.clickOnElement(ChequePayeeName);
		}
	}
	
	public void clickOnAboutUs() {
		WebDriverUtility.clickOnElement(aboutUs);
	}
	
	public String accountCreationMessage() {
		String message = successMessage.getText();
		System.out.println(message);
		return message;
	}
	
	public void clickOnContineButton() {
		WebDriverUtility.clickOnElement(coninueButton);
	}
	
	public void clickOnEditAccount() {
		WebDriverUtility.clickOnElement(Editinfomation);
	}
	public void clickOnbankTransfer() {
	WebDriverUtility.clickOnElement(bankTransfer);
	}
	public void clickOnbankname(String BName) {
	WebDriverUtility.enterValue(bankname, BName);;
	}
	
	public void clickOnbankbranchnumber(String bchName) {
	WebDriverUtility.enterValue(bankbranchnumber, bchName);	
	}
	
	public void clickOninputbankswiftcode(String sName) {
	WebDriverUtility.enterValue(inputbankswiftcode, sName);
	}
	
	
	public void clicOninputbankaccountname(String accName) {
		WebDriverUtility.enterValue(inputbankaccountname, accName);
	}
	
	public void clickOninputbankaccountnumber(String accNumber) {
		WebDriverUtility.enterValue(inputbankaccountnumber, accNumber);
	}
		
	public void clicOnaccountaffiliate() {
		WebDriverUtility.clickOnElement(affiliateAccount);
	}
	
	public String accountEditMessage() {
		String message =editSuccessMessage.getText();
		System.out.println(message);
		return message;
	}
	
	}
		
		
	
			
		
		
		
	

