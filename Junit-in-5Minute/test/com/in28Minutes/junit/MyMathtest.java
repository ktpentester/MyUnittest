package com.in28Minutes.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.in28minute.junit.MyMath;

public class MyMathtest {

	MyMath myMath = new MyMath();
	
	@Before
	public void before() {
		System.out.println("Before");
		
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After class");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("Test1");
		int result = myMath.sum(new int[] {1, 2, 3}); 
	  assertEquals(6, result);
	}
	  @Test
		public void sum_with1numbers() {
		  System.out.println("Test2");
		  int result = myMath.sum(new int[] {3});
		  assertEquals(3, result);
				
		
	}

}
