package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Assert;
import org.junit.Test;

public class BTest {
	@Test
	public void methodB1() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue("Successful test", true);
	}
	
	@Test
	public void methodB2() throws InterruptedException {
		Thread.sleep(10000);
		Assert.assertTrue("Successful test", true);
	}
}
