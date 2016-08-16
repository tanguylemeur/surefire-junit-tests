package com.appnexus.viewability.core.surefireJunitTests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public abstract class BaseTest {
	protected static Path tmpDir = Paths.get("target/");
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
	
    public void writeFile() {
    	try {
    		File file = new File(tmpDir + "/" + this.getTestName() + ".log");
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
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
