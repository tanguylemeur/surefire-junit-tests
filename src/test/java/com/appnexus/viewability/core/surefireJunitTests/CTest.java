package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Assert;
import org.junit.Test;

public class CTest extends BaseTest {
	public CTest(String param) {
		super(param);
	}

	@Test
	public void methodC1() throws InterruptedException {
		Thread.sleep(1 * 1000);
		Assert.assertTrue("Successful test", true);
	}
		
	@Test
	public void methodC2() throws InterruptedException {
		Thread.sleep(1 * 1000);
		Assert.assertTrue("Successful test", true);
//		Assert.assertTrue("Failing test param: " + this.param, false);
	}
}
