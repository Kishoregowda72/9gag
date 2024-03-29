
package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Action_generic
{
	public void mousehower(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	public void RightClick(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	public void Double(WebDriver driver,WebElement ele)
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();;
	
	}
	public void Drag(WebDriver driver,WebElement ele,WebElement ele1)
	{
		Actions act=new  Actions(driver);
		act.dragAndDrop(ele, ele1).perform();
	}
	public void New_tab(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
	}
	public void New_Window(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
	}
	public void New_Private(WebDriver driver,WebElement ele) throws AWTException
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
	}
	
}
