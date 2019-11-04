package pom;

import org.testng.annotations.Test;

import generic.Generic;

public class gmail_test extends Generic{
	
	@Test
	public void test_login() throws InterruptedException
	{
	
	gmail_signup gs=new gmail_signup(driver);
	gs.gen("chethan", "gowda", "chethangowda", "9876543210","9876543210");

	}
}
