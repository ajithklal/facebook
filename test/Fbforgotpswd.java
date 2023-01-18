package test;

import org.testng.annotations.Test;

import pages.Forgotten;

public class Fbforgotpswd extends Baseclass {

	@Test
	public void test2()
	{
		Forgotten ob=new Forgotten(driver);
		ob.click();
		ob.valuepass("95399156963");
		ob.buttonclick();
	}
}
