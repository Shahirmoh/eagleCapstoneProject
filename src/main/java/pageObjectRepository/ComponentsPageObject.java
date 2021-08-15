package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class ComponentsPageObject extends Base{
	
	
		   
		public   ComponentsPageObject () {
		PageFactory.initElements(driver, this);
		}

	@FindBy	(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]")
	private WebElement components;
	
	@FindBy(xpath="//a[contains(text(),'Show All Components')]")
	private WebElement showAllcomponents;
	
	
		
		
		
		
		
		
}
