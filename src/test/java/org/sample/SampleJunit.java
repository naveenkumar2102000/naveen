package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleJunit {

   @BeforeClass

public static void beforeClass() {
	System.out.println("Before Class");
}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void test() {
		System.out.println("Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
