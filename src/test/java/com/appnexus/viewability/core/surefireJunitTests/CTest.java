package com.appnexus.viewability.core.surefireJunitTests;

import org.junit.Test;

public class CTest extends BaseTest {
	public CTest(String param) {
		super(param);
	}

	@Test
	public void methodC1() throws InterruptedException {
		sleep(1);
	}
		
	@Test
	public void methodC2() throws InterruptedException {
		sleep(1);
	}
}
