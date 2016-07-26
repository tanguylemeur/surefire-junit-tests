package com.appnexus.viewability.core.surefireJunitTests;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.runner.RunWith;


import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public abstract class BaseTest {
	protected String param;
	
	public BaseTest(String param) {
		this.param = param;
	}
	
	@Parameters(name = "{0}")
	public static Collection<String> parameterList() throws Exception {
		Collection<String> c = new ArrayList<String>();
		for (int i=0 ; i <= 2; i++) {
			c.add("p" + i);
		}
		
		return c;
	}
}
