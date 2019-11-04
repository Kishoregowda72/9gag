package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Drop_generic;

public class gmail_signup {
	
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='Username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='Passwd']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='ConfirmPasswd']")
	private WebElement cpassword;
	
	@FindBy(xpath="//span[@class='CwaK9']")
	private WebElement next;

	
	 public gmail_signup (WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
	}
	 
	 public void gen(String fn,String ln,String un,String pwd,String cpwd)
	 {
		 firstname.sendKeys(fn);
		 lastname.sendKeys(ln);
		 username.sendKeys(un);
		 password.sendKeys(pwd);
		 cpassword.sendKeys(cpwd);
		 next.click();
	 }
	
	 
	 
	
}
