package scripts;


import org.testng.annotations.Test;

import generic.Generic;
import pom.compose_page;
import pom.password;
import pom.username;

public class test_login extends Generic {
	@Test
	public void test_login() throws InterruptedException
	{
		username un=new username(driver);
		password pw=new password(driver);
		compose_page cp=new compose_page(driver);
		un.setusername("kishoregowda72@gmail.com");
		un.nextlogin();
		Thread.sleep(3000);
		pw.setpassword("8884893902");
		pw.next2login();
		Thread.sleep(3000);
		cp.compose();
		Thread.sleep(3000);
		cp.TOtext("kishoregowda72@gmail.com");
		Thread.sleep(3000);
		cp.subtext("hello");
		Thread.sleep(3000);
		cp.send();
		
		
		
		
	}

}
