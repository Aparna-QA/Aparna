package com.examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {
	// Hello
	@Test(priority=3)
	public void add()
	{
		System.out.println("addition");
	}
	
	@Test(priority=1)
	public void sub()
	{
		System.out.println("subtraction");
	}

	@Test(priority=2)
	public void mul()
	{
		System.out.println("multiplication");
	}
	
	@Test(priority=4)
	public void login()
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
	}
	
}
