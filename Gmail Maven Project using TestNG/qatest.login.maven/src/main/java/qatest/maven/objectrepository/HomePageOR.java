package qatest.maven.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOR {

	
	public HomePageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//title")
	protected WebElement title;
	
	@FindBy(id = "identifierId")
	protected WebElement usernameinput;
	
	@FindBy(id = "identifierNext")
	protected WebElement nextButton;
	
	@FindBy(xpath = "//input[@type = 'password']")
	protected WebElement passwordinput;
	
	@FindBy(id = "passwordNext")
	protected WebElement submit;
	
}
