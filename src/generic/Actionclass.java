package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Actionclass 
{
	
	public void mousehover(WebDriver driver, WebElement ele)
	{
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
    public void dragandDrop(WebDriver driver, WebElement source,WebElement target)
    {
    	Actions act= new Actions(driver);
    	act.dragAndDrop(source, target).perform();
    	
    }
    
    public void nTab(WebDriver driver, WebElement ele) throws AWTException
    {
    	Robot r = new Robot();
    	Actions act= new Actions(driver);
    	act.contextClick(ele).perform();
    	r.keyPress(KeyEvent.VK_T);
    	r.keyRelease(KeyEvent.VK_T);
    	
    }
    
    public void nWin(WebDriver driver, WebElement ele) throws AWTException
    {
    	Robot r = new Robot();
    	Actions act= new Actions(driver);
    	act.contextClick(ele).perform();
    	r.keyPress(KeyEvent.VK_W);
    	r.keyRelease(KeyEvent.VK_W);
    }
    
    public void nPrinwin(WebDriver driver, WebElement ele) throws AWTException
    {
    	Robot r = new Robot();
    	Actions act= new Actions(driver);
    	act.contextClick(ele).perform();
    	r.keyPress(KeyEvent.VK_P);
    	r.keyRelease(KeyEvent.VK_P);
    }
    public void dclick(WebDriver driver, WebElement ele)
    {
    	Actions act = new Actions(driver);
    	act.doubleClick(ele).perform();
    }
    
}
