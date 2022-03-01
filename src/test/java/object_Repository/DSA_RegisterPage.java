package object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSA_RegisterPage {

	
	WebDriver driver=null;
	
	public  DSA_RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement user_name()
	{
		By username=By.id("id_username");
		return driver.findElement(username);
	}
	
	public WebElement password1()
	{
		By pwd1=By.id("id_password1");
		return driver.findElement(pwd1);
	}

	public WebElement password2()
	{
		By pwd2=By.id("id_password2");
		return driver.findElement(pwd2);
	}  
	
	//input[@type='submit']
	public WebElement registerbutton()
	{
		By regButton=By.xpath("//input[@value='Register']");
		return driver.findElement(regButton);
	}
	
}
