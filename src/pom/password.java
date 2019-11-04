package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class password {
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement next2;
	
	
	public password(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
