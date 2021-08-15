package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class Mp3PlayersPageObject extends Base {
	public Mp3PlayersPageObject () {
		PageFactory.initElements(driver, this);
	}

    @FindBy(xpath="//body/div[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]")
    private WebElement mp3player;
    
    @FindBy(xpath="//a[contains(text(),'Show All MP3 Players')]")
    private WebElement showAllmp3player;
    
    @FindBy(xpath="//select[@id='input-sort']")
	private WebElement sortBy;
	
	@FindBy(xpath="//select[@id='input-limit']")
	private WebElement show;
}
