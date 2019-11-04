package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class compose_page {
	

	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@aria-label='To']")
	private WebElement totext;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subtext;
	
	@FindBy(xpath="//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	private WebElement send;
	
	public compose_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void compose()
	{
		compose.click();
	}
	
	public void TOtext(String to)
	{
		totext.sendKeys(to);
	}
	
	public void subtext(String sub)
	{
		subtext.sendKeys(sub);
	}

	
	public void send()
	{
		send.click();
	}
}
