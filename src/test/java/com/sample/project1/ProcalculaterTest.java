package com.sample.project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProcalculaterTest {

	@Test
	public void testadd()
	{
		Procalculater cal=new Procalculater();
		assertEquals(10, cal.add(5, 5));
	}
	
	@Test
	public void testsub()
	{
		Procalculater cal=new Procalculater();
		assertEquals(5, cal.sub(10, 5));
	}

}
