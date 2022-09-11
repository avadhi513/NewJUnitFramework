package org.unit;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AnotherJunit {
	
	public static void main(String[] args) {
		
		Result rs = JUnitCore.runClasses(UnitInJava.class, SampleJunit.class);
		System.out.println("Ignore Count: "+rs.getIgnoreCount());
		System.out.println("Time Count: "+rs.getRunTime());
		System.out.println("Run Count: "+rs.getRunCount());
		System.out.println("Failure Count: "+rs.getFailureCount());
		
		List<Failure> fa = rs.getFailures();
		for(Failure x : fa) {
			System.out.println(x);
		}
		
	}

}
