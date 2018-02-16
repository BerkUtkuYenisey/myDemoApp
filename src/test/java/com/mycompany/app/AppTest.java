package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;



/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
   
	public void testFor4() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		App test = new App();
		int output = test.howManyCD(a, b, 1, 2);
		assertEquals(output,4);
	}
	
	public void testFor3() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		App test = new App();
		int output = test.howManyCD(a, b, 1, 4);
		assertEquals(output,3);
	}
	
	public void testFor2() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		App test = new App();
		int output = test.howManyCD(a, b, 1, 5);
		assertEquals(output,2);
	}
	
	public void testFor1() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		App test = new App();
		int output = test.howManyCD(a, b, 4, 5);
		assertEquals(output,1);
	}
	
	public void testFor0() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		App test = new App();
		int output = test.howManyCD(a, b, 6, 5);
		assertEquals(output,0);
	}
	
	public void testForNullB() {
		App test = new App();
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(3);
		int output = test.howManyCD(null, b, 3, 1);
		assertEquals(output,-1);
	}
	
	public void testForNullA() {
		App test = new App();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		int output = test.howManyCD(a, null, 3, 1);
		assertEquals(output,-1);
	}

}
