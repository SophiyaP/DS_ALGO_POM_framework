package object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DSA_StackPage {

	//create constructor
	WebDriver driver=null;
	public DSA_StackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(how=How.XPATH,using="//a[@href='stack']") //syntax1
WebElement stackStarted;

//Operations in Stack :::

@FindBy(how=How.LINK_TEXT,using ="Operations in Stack")
WebElement operationsinStack;

@FindBy(linkText="Try here>>>")
WebElement Tryhere1;

@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")   
WebElement editor1;

@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")   
WebElement editortext;
@FindBy(xpath="//button[text()='Run']")
WebElement RunButton1;

@FindBy(css="pre[id='output']")
WebElement outputText1;

//Implementation in Stack :::
@FindBy(linkText="Implementation") // syntax2
WebElement Implementation;

@FindBy(linkText="Try here>>>")
WebElement Tryhere2;

@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
WebElement editor2;

@FindBy(xpath="//button[text()='Run']")
WebElement RunButton2;

@FindBy(css="pre[id='output']")
WebElement outputText2;

//Applications in Stack :::
@FindBy(linkText="Applications")
WebElement Applications;

@FindBy(linkText="Try here>>>")
WebElement Tryhere3;

@FindBy(xpath="//form[@id='answer_form']/div/div/div/textarea")
WebElement editor3;

@FindBy(xpath="//button[text()='Run']")
WebElement RunButton3;

@FindBy(css="pre[id='output']")
WebElement outputText3;

//Practice Questions in Stack :::

@FindBy(linkText="Practice Questions")
WebElement PractiseQuestions;


public WebElement signinbutton() {
	By signin = By.linkText("Sign in");
	return driver.findElement(signin);
}
public WebElement username() {
	By userName = By.xpath("//input[@id='id_username']");
	return driver.findElement(userName);
}

public WebElement password() {
	By pwd = By.xpath("//input[@id='id_password']");
	return driver.findElement(pwd);
}
public WebElement loginButton() {

	By login = By.xpath("//input[@value='Login']");
	return driver.findElement(login);

}
public void stackGetStarted()
{
	stackStarted.click();
}

public void Operations()
{
	operationsinStack.click();
}
public void tryHere1()
{
	Tryhere1.click();
}
public void editor1(String pythonCode)
{
	editor1.sendKeys(pythonCode);
}

public void clearpreText1() {
	editor1.sendKeys(Keys.CONTROL+ "a");
	editor1.sendKeys(Keys.DELETE);
}
public void runButton1()
{
	RunButton1.click();
}
public void editortext() {
	editortext.clear();
}
public void outputText1()
{
	 outputText1.getText();
}
public void Implementation()
{
	Implementation.click();
}
public void tryHere2()
{
	Tryhere2.click();
}
public void editor2(String pythonCode)
{
	editor2.sendKeys(pythonCode);
}

public void runButton2()
{
	RunButton2.click();
}
public void Applications()
{
	Applications.click();
}
public void tryHere3()
{
	Tryhere3.click();
}
public void editor3(String pythonCode)
{
	editor3.sendKeys(pythonCode);
}

public void runButton3()
{
	RunButton3.click();
}
public void practicequestions()
{
	PractiseQuestions.click();
}

}
