package com.examples;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("beforesuit");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("afterclass");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("aftersuit");
	}

}
