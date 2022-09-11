package org.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class UnitInJava {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public static void before() {
		System.out.println("Before");
	}
	
	@After
	public static void after() {
		System.out.println("After");
	}
	
	@Test
	public void test1() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}
	
	@Ignore
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(true);
	}
	
}
