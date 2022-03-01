package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import object_Repository.DSA_ArraysPage;
import object_Repository.DSA_SigninPage;
import static utils.configPropertiesFile.getUrl;
import static utils.configPropertiesFile.getUserName;
import static utils.configPropertiesFile.getPassword;
import static utils.configPropertiesFile.getEditorText;
import static utils.configPropertiesFile.invalidcode;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import static utils.configPropertiesFile.getEditorText2;

public class DS_ArraysPageTest {
	@Test
	public void arraysPage() throws InterruptedException {
		try {
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Selenium Downloads\\New folder\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get(getUrl());
			driver.manage().window().maximize();

			DSA_ArraysPage page = new DSA_ArraysPage(driver);
			page.signinbutton().click();

			page.username().sendKeys(getUserName());

			page.password().sendKeys(getPassword());

			page.loginButton().click();

			page.dsDropDown().click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			page.arrays().click();
			page.arraysTopics().click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Use JavascriptExecutor for mouse movments like scroll,click

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("scroll(0,2800)");

			page.pageScroll().click();

			page.editor().sendKeys(getEditorText());
			page.runButton().click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//System.out.println(driver.getTitle());
			driver.navigate().back();
			// System.out.print(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			js.executeScript("scroll(0,-2800)");

			// Calling Objects in Arrays Using List

			page.ArraysUsingLIst().click();
			page.TryButton2().click();
			page.editor2().sendKeys(getEditorText2());
			page.runButton2().click();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
			driver.navigate().back();
			// Basic Opertions Using List

			page.basic().click();
			js.executeScript("scroll(0,2800)");
			page.tryButton3().click();

			page.runButton3().click();

			driver.navigate().back();

			js.executeScript("scroll(0,-1800)");
			
//Calling objects of Applications of Array
			
			page.applicationsArray().click();
			page.tryButon4().click();
			page.editor4().sendKeys(getEditorText2());
			page.runButton4().click();
			driver.navigate().back();
	//Calling objects of Search Array	
			page.PracticeQues().click();
			page.searchArrray().click();
		
			// To delete the pre text in the editor text area
			page.editor5().sendKeys(Keys.CONTROL + "a");
			page.editor5().sendKeys(Keys.DELETE);
			page.editor5().sendKeys(invalidcode());
			//verify Alert  pop up for Run Button with empty text
			page.runButton5().click();
			//Thread.sleep(5000);
			driver.switchTo().alert().accept();
			
			// Realese RUN button
			page.runButton5().sendKeys(Keys.CLEAR);


			page.editor5().sendKeys(Keys.CONTROL + "a");
			page.editor5().sendKeys(Keys.DELETE);

	
			page.editor5().sendKeys(getEditorText2());
			page.runButton5().click();
	
			page.submitButton5().click();
		
			// Verify if Run Button is clicked -specific output is displayed
			//or if Submit button is clicked-error msg is displayed
			if (page.runButton5().isEnabled()) {
				page.output().isDisplayed();
					}
			else if (page.submitButton5().isEnabled()) {
				page.submitText().isDisplayed();
		
			} else {
				System.out.println("No such button found");
			}
		driver.navigate().back();
		
		//Calling Max COnsecutive ones objects
		page.maxConsecutive().click();
		//page.editor6().click();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
		page.runButton6().click();
		driver.switchTo().alert().accept();
  page.runButton5().sendKeys(Keys.CLEAR);
		page.editor6().sendKeys(Keys.CONTROL+ "a");
		page.editor6().sendKeys(Keys.DELETE);
		page.editor6().sendKeys(getEditorText2());
		page.runButton6().click();
		page.submitButton6().click();
		//Wait is required below
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(3000);
		if(page.submitButton6().isEnabled()) {
			WebElement submitText=page.submitText6();
		String txt=	submitText.getText();
			//System.out.println(txt);
		Assert.assertEquals(txt,"Error occurred during submission");
		}
driver.navigate().back();

////3.Find the number with even number of digits Objects
			
			 page.findNo().click();
			 page.editor7().sendKeys(Keys.CONTROL +"a");
			 page.editor7().sendKeys(Keys.DELETE);
			 page.editor7().sendKeys(getEditorText2() +"Hello");  // sending invalid input
			 page.runButton7().click();
			 driver.switchTo().alert().accept();
			 page.runButton5().sendKeys(Keys.CLEAR);
			// page.runButton7().sendKeys(Keys.RETURN);
			 page.editor7().sendKeys(Keys.CONTROL +"a");
			 page.editor7().sendKeys(Keys.DELETE);
			 page.editor7().sendKeys(getEditorText2());
			 page.runButton7().click();
			 if(page.runButton7().isEnabled()) {
		WebElement txt=	 page.submitText7();
		String inputTxt=txt.getText();
		//System.out.println(inputTxt);
			  Assert.assertEquals(inputTxt.contains(getEditorText2()),false);
			 }
			 page.submitButton7().click();
			 driver.navigate().back();
			 
			 //Calling Squares of sorted Array objects
			 
			 page.sortedArray().click();
			 page.editor8().sendKeys(Keys.CONTROL +"a");
			 page.editor8 ().sendKeys(Keys.DELETE);
			 page.editor8().sendKeys(getEditorText2());
			 page.runButton8().click();
		
			// explicit wait to see submit button is clickable /not
			     
			         WebDriverWait ewait = new WebDriverWait(driver, 10);
			         ewait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
			         page.submitButton8().click(); //button clicks or not
			Thread.sleep(3000);
			//driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
			 if(page.submitButton8().isEnabled())
			 {   
				 WebElement txt=driver.findElement(By.xpath("//pre[@id='output']"));
				 String submitText=txt.getText();
				 Assert.assertEquals(submitText, " No tests were collected"); 
			 }
			
			   driver.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
