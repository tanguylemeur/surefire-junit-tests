package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Assert;
import org.junit.Test;

public class CTest {
	@Test
	public void methodC1() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue("Successful test", true);
	}
		
//	@Test
	public void methodC2() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue("Failing test", false);
	}
}
