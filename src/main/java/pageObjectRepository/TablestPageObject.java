package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TablestPageObject extends Base{
	
	public TablestPageObject() {
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath=" //body/div[1]/nav[1]/div[2]/ul[1]/li[4]/a[1]")
	private WebElement tablets;
	
	@FindBy(xpath="//select[@id='input-sort']")
	private WebElement sortBy;
	
	@FindBy(xpath="//select[@id='input-limit']")
	private WebElement show;
	
	
	
}
