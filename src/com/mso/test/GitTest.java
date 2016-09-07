package com.mso.test;

import org.junit.Test;

public class GitTest {
	public String printHello(){
		return "HelloWorld";
	}
	
	@Test
	public void test01(){
		System.out.println(printHello());
		
	}

}
