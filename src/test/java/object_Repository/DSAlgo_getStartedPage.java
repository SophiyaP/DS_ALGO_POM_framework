package object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSAlgo_getStartedPage {

	WebDriver driver=null;

	public  DSAlgo_getStartedPage(WebDriver driver)  // creating constructor
	{
		this.driver=driver; // this represents local driver object 
	}
	
	public WebElement startPage()
	{
		By startedButton=By.xpath("//button[text()='Get Started']");
		return driver.findElement(startedButton);
	}
	
	
	
	public WebElement RegisterButton()
	{
		By registerButton=By.linkText("Register");
		return driver.findElement(registerButton);
	}
}
