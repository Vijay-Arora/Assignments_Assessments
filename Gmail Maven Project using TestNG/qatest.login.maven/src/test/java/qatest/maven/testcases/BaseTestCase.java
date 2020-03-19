package qatest.maven.testcases;
import java.io.IOException;

import org.testng.annotations.*;

import qatest.maven.commonfunctions.*;
import qatest.maven.pagefunctions.*;

public class BaseTestCase {
	CommonFunctions cf;
	protected HomePagePF homepage;
	protected DashboardPF dashboardpage;
	
	@BeforeTest
	public void beforeTest() {
		try {
			ConfigManager.loadProperties();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		String browser = ConfigManager.getProp().getProperty("browser");
		cf = new CommonFunctions();
		cf.startDriver(browser);
		homepage = new HomePagePF(cf.getDriver());
	}
	
	@AfterSuite
	public void afterSuite() {
		cf.closeDriver();
	}
}
