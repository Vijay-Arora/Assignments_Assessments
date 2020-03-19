package qatest.maven.pagefunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import qatest.maven.objectrepository.DashboardOR;

public class DashboardPF{
	
	WebDriver driver = null;

	public DashboardPF(WebDriver driver) throws InterruptedException{
		// TODO Auto-generated constructor stub
		this.driver=driver;
		Thread.sleep(10000);
		if(!driver.getCurrentUrl().equalsIgnoreCase("https://mail.google.com/mail/u/0/#inbox"))
		{
			throw new SkipException("This is not dashboard Page");
		}
	}
}
