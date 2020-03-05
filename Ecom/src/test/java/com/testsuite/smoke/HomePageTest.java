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
}
