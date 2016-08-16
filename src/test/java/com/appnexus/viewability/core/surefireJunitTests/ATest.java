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
		
		switch (this.param) {
			case "p0":
				sleepTime = 5;
				break;
			case "p1":
				sleepTime = 2;
				break;
			case "p2":
				sleepTime = 1;
				break;
		}
		
		debug("start", sleepTime);
		Thread.sleep(sleepTime * 1000);
		Assert.assertTrue("Successful test", true);
		writeFile();
		debug("stop", sleepTime);
	}
	
	@Test
	public void methodA2() throws InterruptedException {
		writeFile();
	}
}
