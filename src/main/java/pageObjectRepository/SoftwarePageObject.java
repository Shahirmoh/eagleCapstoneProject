package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class SoftwarePageObject extends Base {
	public SoftwarePageObject () {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[5]/a[1]")
	private WebElement Software;
	
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	private WebElement continueButton;
	
	
	
	
}
