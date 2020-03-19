package Training;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

public class Test {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay.Arora\\eclipse\\chromedriver/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("user-data-dir=C:\\Users\\Vijay.Arora\\AppData\\Local\\Google\\Chrome\\User Data");
	options.addArguments("--start-maximized");
	//options.addArguments("--enable-automation");
	//options.addArguments("--enable-javascript");
	driver = new ChromeDriver(options);
    driver.get("https://www.gmail.com");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.id("identifierId")).sendKeys("qa.automation843");
    Thread.sleep(6000);
    driver.findElement(By.id("identifierNext")).click();
    WebDriverWait wait= new WebDriverWait(driver,60);
    
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='password']")))).sendKeys("Vijay@test");
    Thread.sleep(3000);
    driver.findElement(By.id("passwordNext")).click();
    
}
	
}