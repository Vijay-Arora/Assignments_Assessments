package qatest.maven.commonfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	static WebDriver driver=null;
	
	//getter
	public WebDriver getDriver() {
		return driver;
	}
	
	//setter
	public static void setDriver(WebDriver driver) {
		CommonFunctions.driver = driver;
	}
	
	//start driver function
	public void startDriver(String browser) {
		switch(browser) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default: 
			System.out.println("Please enter a valid browser");
			break;
		}
		driver.get(ConfigManager.getProp().getProperty("url"));
		setDriver(driver);
		
	}
	
	//close driver function
	public void closeDriver(){
		driver.close();
		setDriver(driver);
	}
}
