package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Test;
import org.junit.Assert;

public class ATest {
	@Test
	public void methodA1() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue("Successful test", true);
	}
	
	@Test
	public void methodA2() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue("Successful test", true);
	}
}
