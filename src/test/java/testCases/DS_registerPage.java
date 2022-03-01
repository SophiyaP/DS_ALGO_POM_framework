package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import object_Repository.DSA_RegisterPage;

public class DS_registerPage {
	@Test
	public void getStarted() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Selenium Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/register");
		DSA_RegisterPage page = new DSA_RegisterPage(driver);
		page.user_name().sendKeys("sofijosems@gmail.com");
		page.password1().sendKeys("t@A1234xyz");

		page.password2().sendKeys("t@A1234xyz");

		page.registerbutton().click();
		driver.close();

	}
}
