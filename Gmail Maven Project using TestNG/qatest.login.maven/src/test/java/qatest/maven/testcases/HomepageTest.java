package qatest.maven.testcases;

import org.testng.Assert;
import org.testng.annotations.*;

import qatest.maven.commonfunctions.ConfigManager;

public class HomepageTest extends BaseTestCase{
	
	@Test (priority = 0)
	public void verifyTitle() {
		Assert.assertTrue(homepage.isTitleMatched());
	}
	
	@Test (priority = 1)
	public void verifyLoginFunctionality() throws InterruptedException {
		dashboardpage = homepage.loginToWeb(ConfigManager.getProp().getProperty("username"), ConfigManager.getProp().getProperty("password"));
		Assert.assertTrue(dashboardpage!=null);
	}
}
