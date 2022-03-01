package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import object_Repository.DSA_RegisterPage;
import object_Repository.DSA_SigninPage;
import object_Repository.DSAlgo_getStartedPage;
import utils.XLUtils;

public class Signin_DataDriven {


	//@DataProvider(name="DataForDSAlgo_Signin")
	
	@Test (dataProvider="DataForDSAlgo_Signin")
	
	public void getStarted(String userName,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Selenium Downloads\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://dsportalapp.herokuapp.com/home");
		DSA_SigninPage signinPage = new DSA_SigninPage(driver);
		signinPage.signinbutton().click();
		signinPage.username().sendKeys(userName);
		signinPage.password().sendKeys(password);
		signinPage.loginButton().click();
		driver.close();
		
	}
	@DataProvider(name="DataForDSAlgo_Signin")
	
	   String [][] getTestData1() throws IOException
		{
			// read data from excel 
			//String userdir=System.getProperty("user.dir");
		String excelPath= "./TestData/Data.xls";
		//System.out.println(excelPath);


			int rowNum=XLUtils.getRowCount(excelPath,"Sheet1");  // to get row count
			int colCount=XLUtils.getCellCount(excelPath,"Sheet1", 1); // to get  no of columns in row 1.

			String testData[][]=new String[rowNum][colCount];

			for(int i=1; i<=rowNum;i++) // starting from row [1] as row[0] is header in excelsheet
			{
				for(int j=0;j<colCount;j++)//starting from column [0] as column[0]			
				{
					testData[i-1][j]=XLUtils.getCellData(excelPath,"Sheet1", i, j);
				}
			}					
	return(testData);
			
}
}

