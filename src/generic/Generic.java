package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://Gmail.com/");
	
		
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		//Thread.sleep(3000);
		//driver.quit();
	}

}
