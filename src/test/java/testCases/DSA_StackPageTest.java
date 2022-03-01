package testCases;

import static utils.configPropertiesFile.getPassword;
import static utils.configPropertiesFile.getUserName;
import static utils.configPropertiesFile.getEditorText;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import object_Repository.DSA_StackPage;

public class DSA_StackPageTest {

	@Test
	public void DSA_stackpageOperational() throws InterruptedException{
		try {	
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Selenium Downloads\\New folder\\chromedriver.exe");

		driver=new ChromeDriver();
	 
	 driver.get("https://dsportalapp.herokuapp.com/home");
	 //Create Object for DSA_StackPage
	 
DSA_StackPage pageobj=new DSA_StackPage(driver);
//JavaScript Executor for mouse scroll movements
JavascriptExecutor js=(JavascriptExecutor)driver;

pageobj.signinbutton().click();


	pageobj.username().sendKeys(getUserName());

pageobj.password().sendKeys(getPassword());

pageobj.loginButton().click();
driver.manage().window().maximize();
js.executeScript("scroll(0,1000)");
pageobj.stackGetStarted();

pageobj.Operations();

js.executeScript("scroll(0,1800)");
pageobj.tryHere1();
pageobj.editor1(getEditorText());
pageobj.runButton1();

pageobj.outputText1();

driver.navigate().back();
pageobj.Implementation();
pageobj.tryHere2();
pageobj.editor2(getEditorText());
pageobj.runButton2();
driver.navigate().back();
pageobj.Applications();
pageobj.tryHere3();
pageobj.editor3(getEditorText());
pageobj.runButton3();
driver.navigate().back();
pageobj.practicequestions();
String title=driver.getTitle();
//System.out.println(title);
Assert.assertEquals(title,"Practice Questions");
driver.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	}
	
			
