package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Assert;
import org.junit.Test;

public class ATest extends BaseTest {	
	public ATest(String param) {
		super(param);
	}

	@Test
	public void methodA1() throws InterruptedException {
		int sleepTime = 1;
		
		if (this.param.equals("p0")) {
			sleepTime = 20;
			System.out.println("sleeptime = " + sleepTime);
		}
		
		Thread.sleep(sleepTime * 1000);
		Assert.assertTrue("Successful test", true);
	}
	
	@Test
	public void methodA2() throws InterruptedException {
		Thread.sleep(2 * 1000);
		Assert.assertTrue("Successful test", true);
	}
}
