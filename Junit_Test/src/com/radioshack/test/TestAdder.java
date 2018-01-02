package com.radioshack.test;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.radioshack.util.Adder;

import junit.framework.Assert;

public class TestAdder {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdd()
	{
		Adder addObj=new Adder(100,50);
		System.out.println("TEST >>>> Inside testAdd");
		Assert.assertEquals(150,addObj.Add());
	}

}
