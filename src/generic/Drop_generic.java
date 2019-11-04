package generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_generic 
{
	public void selectIndex(WebElement ele,int i)
	{
		Select s=new Select(ele);
		s.selectByIndex(i);
		
	}
	
	public void selectValue(WebElement ele,String val)
	{
		Select s=new Select(ele);
		s.selectByValue(val);
		
	}
	public void selectText(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
		
	}
	public void Deselect(WebElement ele)
	{
		Select s=new Select(ele);
		s.deselectAll();
		
	}
	public void DeselectBy(WebElement ele,int j)
	{
		Select s=new Select(ele);
		s.deselectByIndex(j);
		
	}
	public void selectValue_de(WebElement ele,String val1)
	{
		Select s=new Select(ele);
		s.deselectByValue(val1);
		
	}
	public void selectText_de(WebElement ele,String text1)
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text1);
		
	}
	public boolean Multiple(WebElement ele)
	{
		Select s=new Select(ele);
		boolean b = s.isMultiple();
		return b;
	
		
	}
	public void Options(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		for(WebElement we:options)
		{
			String txt = we.getText();
			System.out.println(txt);
		}
		
	}
	public int Option_size(WebElement ele)
	{
		Select s=new Select(ele);
		List<WebElement> len = s.getOptions();
		int count = len.size();
		return count;
		
	}
}