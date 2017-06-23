package com.appnexus.viewability.core.surefireJunitTests;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;


import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public abstract class BaseTest {
	protected String param;
	
	public BaseTest(String param) {
		this.param = param;
	}
	
	@Rule
	public TestName					testName	= new TestName();
	
	@Parameters(name = "{0}")
	public static Collection<String> parameterList() throws Exception {
		Collection<String> c = new ArrayList<String>();
		for (int i=0 ; i <= 2; i++) {
			c.add("p" + i);
		}
		
		return c;
	}
	
	public void sleep(int time) {
		System.err.println("Start: " + this.getClass().getSimpleName() + "." + testName.getMethodName());
		try {
			Thread.sleep(time * 100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("End:   " + this.getClass().getSimpleName() + "." + testName.getMethodName());
	}
}
