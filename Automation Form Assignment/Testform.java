package Training;
import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.*;

public class Testform {
	public static void main(String[] args) throws InterruptedException {
		// setting path to firefox gecko driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay.Arora\\eclipse\\geckodriver\\geckodriver.exe");
		
		// initializing object for Firefox Driver
		WebDriver driver = new FirefoxDriver();
		
		//javascript executer to execute javascript methods
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		
		// getting url from server
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		// defining explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		//finding web element partial link 
		WebElement par_link = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Partial Link Test")))); 
		par_link.click(); 
		
		//getting current url for verification 
		String actual_par_link= driver.getCurrentUrl();
		System.out.println(actual_par_link + " is verified");
		
		// navigating back to home page
			driver.navigate().back();
		
		//scrolling page by 500 pixels
		//js.executeScript("window.scrollBy(0,500)");
		
		//close cookies bar
		WebElement cookie = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("ACCEPT")));
		cookie.click();
		Thread.sleep(10000);
		
		//checking presence of advertisement
		
		//WebElement ad= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("img[alt=close-link]")));
		//ad.click();
		//Thread.sleep(10000);
		
		// finding webelement link
		WebElement link = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Link Test"))));
		link.click();
		
		// getting current url for verification
		String actual_link = driver.getCurrentUrl();
		if(actual_link.equalsIgnoreCase(actual_link))
				System.out.println(actual_link + " is verified");
		Thread.sleep(10000);
		// navigating back to home page
		driver.navigate().back();
		
		//scrolling page by 300 pixels
		//js.executeScript("window.scrollBy(0,300)");
		
		//finding firstname element and sending text
		WebElement first_name = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("firstname"))));
		first_name.sendKeys("Vijay");
		
		//verifying text - firstname
		boolean actual_text= first_name.isDisplayed();
		System.out.println("Firstname Verified- " + actual_text);
		
		//finding last name element and sending text
		WebElement last_name = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("lastname"))));
		last_name.sendKeys("Arora");
		
		//verifying text - lastname
		boolean actual_last_text= last_name.isDisplayed();
		System.out.println("Lastname Verified- "+ actual_last_text);
		
		//finding simple button - 1
		WebElement button_1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("buttonwithclass"))));
		button_1.click();
		
		// getting current url for verification
		String button1_status = driver.getCurrentUrl();
		if(button1_status.equalsIgnoreCase(button1_status))
				System.out.println(button1_status + " is verified");
		
		//finding radio button for gender
			WebElement radio_button1 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("sex-0"))));
			System.out.println(radio_button1.getAttribute("value"));
			radio_button1.click();
		
		//verifying radio button - 1
		boolean radio_button1_status= radio_button1.isSelected();
		System.out.println("Radio button for gender verified- "+ radio_button1_status);
		
		//finding radio button for year of experience
		WebElement radio_button2 = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("exp-0"))));
		radio_button2.click();
		
		//verifying radio button - 2
		boolean radio_button2_status= radio_button2.isSelected();
		System.out.println("Radio button for years of experience verified- "+ radio_button2_status);
		
		//finding Date element and sending text
		WebElement date_text = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("datepicker"))));
		date_text.sendKeys("17-02-2020");
		
		//verifying date - 17-02-2020
		boolean actual_date= date_text.isDisplayed();
		System.out.println("Date Verified- "+ actual_date);
		
		//finding Profession element and selecting checkbox
		WebElement checkbox_1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("profession-0")));
		
		//verifying checkbox status										
        checkbox_1.click (); 			
        System.out.println("Profession Checkbox Status is -  "+checkbox_1.isSelected());
		
        //finding element profile picture and uploading picture
	    WebElement profile = wait.until(ExpectedConditions.elementToBeClickable(By.id("photo")));
	    profile.sendKeys("C:\\Users\\Vijay.Arora\\Downloads\\valenweek.jpg");
	    
	    //verifying picture uploaded or not 
	    boolean actual_picture= profile.isDisplayed();
		System.out.println("Photograph Uploaded- " + actual_picture);
	    
        //download file by finding a link
       // WebElement download = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Selenium Automation Hybrid Framework")));
       // download.click();
        
        //finding Automation Tool element and selecting checkbox
    	WebElement checkbox_auto = wait.until(ExpectedConditions.elementToBeClickable(By.id("tool-2")));
    	
    	//verifying checkbox status										
        checkbox_auto.click (); 			
        System.out.println("Automation Tool Checkbox Status is -  "+checkbox_auto.isSelected());
	    
        //find element in dropdown and select single
        Select dropdown_single = new Select(driver.findElement(By.id("continents")));
        dropdown_single.selectByIndex(2);
        
        //verifying dropdown
        System.out.println("Dropdown is Multiple -  "+dropdown_single.isMultiple());
        System.out.println("Dropdown Status is -  "+dropdown_single.getFirstSelectedOption().getText());
        
      //find element in dropdown and select multiple
        Select dropdown_multi = new Select(driver.findElement(By.id("continentsmultiple")));
        dropdown_multi.selectByIndex(2);
        dropdown_multi.selectByIndex(3);
        List<WebElement> drop_list = dropdown_multi.getAllSelectedOptions();
        
        //verifying dropdown
        System.out.println("Dropdown is Multiple -  "+dropdown_multi.isMultiple());
        boolean drop_status = drop_list.containsAll(drop_list);
        if(drop_status)
        	System.out.println("Dropdown Status contains selected elements -  "+drop_status);
        
      //find element in seleniumcommands and select multiple
        Select dropdown_selenium = new Select(driver.findElement(By.id("selenium_commands")));
        dropdown_selenium.selectByIndex(2);
        dropdown_selenium.selectByIndex(3);
        List<WebElement> drop_sel_list = dropdown_selenium.getAllSelectedOptions();
        
        //verifying dropdown
        System.out.println("Dropdown is Multiple -  "+dropdown_selenium.isMultiple());
        boolean drop_sel_status = drop_sel_list.containsAll(drop_sel_list);
        if(drop_sel_status)
        	System.out.println("Selenium Status contains selected elements -  "+drop_sel_status);
        
	    //finding submit button
	  	WebElement submit_button = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("submit"))));
	  	submit_button.click();
	  	
	  	// getting current url for verification
	  	String submit_status = driver.getCurrentUrl();
	  	if(submit_status.equalsIgnoreCase(submit_status))
	  		System.out.println(submit_status + " is verified");
	    
	}
}