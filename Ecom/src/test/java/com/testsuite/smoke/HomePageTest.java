package com.testsuite.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest 
{

	@Test
	public void Test1()
	{
		System.out.print("first test case");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void Test2()
	{
		System.out.print("seconds test case");
		Assert.assertEquals(true, false);
	}
	
}
