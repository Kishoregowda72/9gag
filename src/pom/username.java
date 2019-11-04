package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class username {
	@FindBy(id="identifierId")
	private WebElement untbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement next;
	
	public username(WebDriver driver)
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
	

}
