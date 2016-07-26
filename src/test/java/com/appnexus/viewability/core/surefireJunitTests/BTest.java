package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Assert;
import org.junit.Test;

public class BTest extends BaseTest {
	public BTest(String param) {
		super(param);
	}

	@Test
	public void methodB1() throws InterruptedException {
		int sleepTime = 1;
		
		if (this.param.equals("p1")) {
			sleepTime = 10;
			System.out.println("sleeptime = " + sleepTime);
		}
		
		Thread.sleep(sleepTime * 1000);
		Assert.assertTrue("Successful test", true);
//		Assert.assertTrue("Failing test param: " + this.param, false);
	}
	
	@Test
	public void methodB2() throws InterruptedException {
		Thread.sleep(2 * 1000);
		Assert.assertTrue("Successful test", true);
	}
}
