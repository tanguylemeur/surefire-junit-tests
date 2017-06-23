package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Test;

public class BTest extends BaseTest {
	public BTest(String param) {
		super(param);
	}

	@Test
	public void methodB1() throws InterruptedException {
		sleep(10);
	}
	
	@Test
	public void methodB2() throws InterruptedException {
		sleep(2);
	}
}
