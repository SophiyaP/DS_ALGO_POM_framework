package object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSA_ArraysPage {

	WebDriver driver = null;

	public DSA_ArraysPage(WebDriver driver) {
		this.driver = driver;
	}

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

	public WebElement dsDropDown() {

		By dsdropdwn = By.xpath("//div[@class='nav-item dropdown']");

		return driver.findElement(dsdropdwn);
	}

	// Objects in Arrays in Python page
	public WebElement arrays() {
		By Arrays = By.linkText("Arrays");
		return driver.findElement(Arrays);
	}

	public WebElement arraysTopics() {
		By arraysinPython = By.linkText("Arrays in Python");
		return driver.findElement(arraysinPython);
	}

	public WebElement pageScroll() {

		By tryhere = By.linkText("Try here>>>");
		return driver.findElement(tryhere);
	}

	public WebElement editor() {
		By editr = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		return driver.findElement(editr);
	}

	public WebElement runButton() {
		By runButton = By.xpath("//button[@type='button']");
		return driver.findElement(runButton);
	}

//Objects in Arrays using List 
	public WebElement ArraysUsingLIst() {
		By ArraysList = By.xpath("//a[normalize-space()='Arrays Using List']");
		return driver.findElement(ArraysList);
	}

	public WebElement TryButton2() {
		By tryButton2 = By.linkText("Try here>>>");
		return driver.findElement(tryButton2);
	}

	public WebElement editor2() {
		By editor2 = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		return driver.findElement(editor2);
	}

	public WebElement runButton2() {
		By runButton2 = By.xpath("//button[@type='button']");
		return driver.findElement(runButton2);
	}

	public WebElement basic() {
		By basicOperations = By.xpath("//a[normalize-space()='Basic Operations in Lists']");
		return driver.findElement(basicOperations);

	}

	public WebElement tryButton3() {
		By tryBtn3 = By.xpath("//a[normalize-space()='Try here>>>']");
		return driver.findElement(tryBtn3);
	}

	public WebElement editor3() {
		By editor3 = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		return driver.findElement(editor3);
	}

	public WebElement runButton3() {
		By runbttn3 = By.tagName("button");
		return driver.findElement(runbttn3);
	}
public WebElement applicationsArray(){
	By applnArray=By.linkText("Applications of Array");
	return driver.findElement(applnArray);
}

public WebElement tryButon4()
{
	By try4=By.linkText("Try here>>>");
	return driver.findElement(try4);
}
public WebElement editor4() {
	By editor4 = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	return driver.findElement(editor4);
}

public WebElement runButton4() {
	By runButton4 = By.xpath("//button[@type='button']");
	return driver.findElement(runButton4);
}
public WebElement PracticeQues() {
	By practiceQues=By.xpath("//a[normalize-space()='Practice Questions']");
	return driver.findElement(practiceQues);
}
public WebElement searchArrray() {
	By searchArray=By.xpath("//a[normalize-space()='Search the array']");
	return driver.findElement(searchArray);
}
public WebElement editorpreText()
{
	By preText=By.xpath("//div[@class='CodeMirror-selected']");
	return driver.findElement(preText);
}
public WebElement editor5() {
	By editor5 = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	return driver.findElement(editor5);
	 }
	public WebElement output() {
		By output = By.xpath("//pre[@id='output']");
		return driver.findElement(output);
	}
	
public WebElement runButton5() {
	By runbttn3 = By.tagName("button");
	return driver.findElement(runbttn3);
}

public WebElement submitButton5() {
	By runbttn3 = By.xpath("//input[@type='submit']");
	return driver.findElement(runbttn3);
}
public WebElement submitText() {
	By submitText = By.xpath("//pre[@id='output']");
	return driver.findElement(submitText);
}
//2.Max COnsecutive ones

public WebElement maxConsecutive() {
	By maxConsecutive=By.xpath("//a[normalize-space()='Max Consecutive Ones']");
	return driver.findElement(maxConsecutive);
	}
public WebElement editorpreText6()
{
	By preText6=By.xpath("//div[@class='CodeMirror-selected']");
	return driver.findElement(preText6);
}
public WebElement editor6() {
	By editor6= By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	return driver.findElement(editor6);
	 }
public WebElement runButton6() {
	By runbttn6 = By.tagName("button");
	return driver.findElement(runbttn6);
}  
public WebElement submitText6() {
	By submitText6 = By.xpath("//pre[@id='output']");
	return driver.findElement(submitText6);
}
public WebElement submitButton6() {
	By runbttn6 = By.xpath("//input[@type='submit']");
	return driver.findElement(runbttn6);
}
//3.Find the number with even number of digits

public WebElement findNo() {
	By findNo=By.linkText("Find Numbers with Even Number of Digits");
	return driver.findElement(findNo);
}
	public WebElement editorpreText7()
	{
		By preText7=By.xpath("//div[@class='CodeMirror-selected']");
		return driver.findElement(preText7);
	}
	public WebElement editor7() {
		By editor7= By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		return driver.findElement(editor7);
		 }
	public WebElement runButton7() {
		By runbttn7 = By.tagName("button");
		return driver.findElement(runbttn7);
	}  
	public WebElement submitButton7() {
		By runbttn7 = By.xpath("//input[@type='submit']");
		return driver.findElement(runbttn7);
	}
	public WebElement RunText7() {
		By RunText7 = By.xpath("//pre[@id='output']");
		return driver.findElement(RunText7);
}
	public WebElement submitText7() {
		By submitText7 = By.xpath("//pre[@id='output']");
		return driver.findElement(submitText7);
	}
	
	//Squares of sorted Array
	public WebElement sortedArray() {
		
		By sortedArray=By.linkText("Squares of a Sorted Array");
		return driver.findElement(sortedArray);
		}
	public WebElement editorpreText8()
	{
		By preText8=By.xpath("//div[@class='CodeMirror-selected']");
		return driver.findElement(preText8);
	}
	public WebElement editor8() {
		By editor8= By.xpath("//form[@id='answer_form']/div/div/div/textarea");
		return driver.findElement(editor8);
		 }
	public WebElement runButton8() {
		By runbttn8 = By.tagName("button");
		return driver.findElement(runbttn8);
	}  
	public WebElement submitButton8() {
		By runbttn8 = By.xpath("//input[@type='submit']");
		return driver.findElement(runbttn8);
	}
	public WebElement submitText8() {
		By submitText8 = By.xpath("//pre[@id='output']");
		return driver.findElement(submitText8);
}
}