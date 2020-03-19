package qatest.maven.pagefunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;

import qatest.maven.objectrepository.HomePageOR;

public class HomePagePF extends HomePageOR{
	
	WebDriver driver = null;
	
	/* Constructor ---------------- */
	public HomePagePF (WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/* Methods -------------------- */
	public boolean isTitleMatched() {
		if(title.getAttribute("innerHTML").equalsIgnoreCase("Gmail")) {
			return true;
		}
		return false;
	}
	
	@SuppressWarnings("deprecation")
	public DashboardPF loginToWeb(String username, String password) throws InterruptedException {
		usernameinput.sendKeys(username);
		nextButton.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(passwordinput)).sendKeys(password);
		submit.click();
		return new DashboardPF(driver);
		
	}
}
