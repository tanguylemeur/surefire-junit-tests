package com.appnexus.viewability.core.surefireJunitTests;


import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import edu.emory.mathcs.backport.java.util.concurrent.ConcurrentLinkedQueue;

@RunWith(Parameterized.class)
public abstract class BaseTest {
	protected String param;
	
    @Rule
    public TestName testName = new TestName();
	
	public BaseTest(String param) {
		this.param = param;
	}
	
    public String getTestName() {
    	return this.getClass().getName() + "." + testName.getMethodName();
	}
    
    public void debug(String state, int sleepTime) {
    	System.out.println(this.getTestName() + " - " + this.param + " - sleeptime = " + sleepTime + " => " + state);
    }
	
	@Parameters(name = "{0}")
	public static ConcurrentLinkedQueue parameterList() throws Exception {
		ConcurrentLinkedQueue q = new ConcurrentLinkedQueue();
		
		for (int i=0 ; i <= 2; i++) {
			q.add("p" + i);
		}
		
		return q;
	}
}
