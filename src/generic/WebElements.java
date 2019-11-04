package generic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class WebElements 
{
  public void clear_action(WebElement ele)
  {
	  ele.clear();
  }
  public void click_action(WebElement ele)
  {
	  ele.click();
  }
  public void getattribute(WebElement ele, String val)
  {
	   ele.getAttribute(val);
  }
  public void getcssval(WebElement ele, String val)
  {
	  ele.getCssValue(val);
  }
  public void getloction(WebElement ele, Point loc)
  {
	  loc =ele.getLocation();
	  System.out.println(loc);
  }
  public void getlocation(WebElement ele, String val)
  {
	  ele.getLocation().getX();
  }
  
  
  
  
  
}
