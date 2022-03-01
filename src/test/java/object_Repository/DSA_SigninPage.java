package object_Repository;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.XLUtils;

public class DSA_SigninPage {

	WebDriver driver=null;
	
	
	public  DSA_SigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement signinbutton()
	{
		By signin=By.linkText("Sign in");
		return driver.findElement(signin);
	}
	
	public WebElement username()
	{
		By userName=By.xpath("//input[@id='id_username']");
		return driver.findElement(userName);
	}
	public WebElement password()
	{
		By pwd=By.xpath("//input[@id='id_password']");
		return driver.findElement(pwd);
	}
	public WebElement loginButton()
	{
	
By login=By.xpath("//input[@value='Login']");
return driver.findElement(login);

	}
	
}

