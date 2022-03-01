package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_Repository.DSAlgo_getStartedPage;

public class GetStartedPage {

	@Test
	public void getStarted()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Downloads\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com");
		DSAlgo_getStartedPage start=new DSAlgo_getStartedPage(driver);
		start.startPage().click();
		start.RegisterButton().click();
		driver.close();
	}
	
}
