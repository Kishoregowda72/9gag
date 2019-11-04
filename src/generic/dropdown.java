package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public void selectIndex(WebElement ele, int i)
	{
		Select s= new Select(ele);
		s.selectByIndex(i);
	}
	
	public void selectValue(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
	public void selectText(WebElement ele, String Text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(Text);
	}
	
	public void DeselectAll(WebElement ele)
	{
		 Select s = new Select(ele);
		 s.deselectAll();
	}
	public void DeselectByvalue(WebElement ele, String Value )
	{
		 Select s = new Select(ele);
		 s.deselectByValue(Value);
	}
	public void DeselectByvisibleText(WebElement ele, String text )
	{
		 Select s = new Select(ele);
		 s.deselectByVisibleText(text);
	}
	public boolean Ismultiple(WebElement ele)
	{
		 Select s = new Select(ele);
		  boolean n=s.isMultiple();
		  
		  return n;
	}
	public int optoinssize(WebElement ele )
	{
		 Select s = new Select(ele);
		 List<WebElement> options = s.getOptions();
		 
		 int count = options.size();
		 System.out.println(count);
		 
		 return count;
		 
		
	}
	public void optoinstext(WebElement ele )
	{
		 Select s = new Select(ele);
		 List<WebElement> options = s.getOptions();
		 
		 for(WebElement we: options)
		 {
			  String text=we.getText();
			  System.out.println(text);
			 
		 }
		
	}
	
	
	
	
	
}
