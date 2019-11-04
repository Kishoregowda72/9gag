package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	@FindBy(id="identifierId")
	private WebElement untbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement next;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement next2;
	
	
	public login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
	public void setusername(String un)
	{
		untbox.sendKeys(un);
	}
	
	public void nextlogin()
	{
		next.click();
	}
	
	public void setpassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void next2login()
	{
		next2.click();
	}
	


}
