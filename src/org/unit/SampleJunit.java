package org.unit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SampleJunit {
	
	@Test
	public void test5() {
		Assert.assertTrue(true);
		Assert.assertTrue(false);
	}
	
	@Ignore
	@Test
	public void test6() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test7() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void test8() {
		Assert.assertTrue(true);
	}

}
