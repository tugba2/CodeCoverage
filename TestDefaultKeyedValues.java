package org.jfree.data;
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class TestDefaultKeyedValues extends DefaultKeyedValues {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final double EPSILON = 0.000000001;
	
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    
    @Before
    public void setUp() throws Exception {
        
        
        
    }
    
    @After
    public void tearDown() throws Exception {
        
    }
	/**
	 * 
	 */
    @Test 
    public void testGetValue(){
    	//int data = 5;
    	DefaultKeyedValues data = new DefaultKeyedValues();
    	data.setValue((Comparable)0, 5);
    	Number expected = 5.0;
    	Number actual = data.getValue(0);
    	
    	assertEquals(expected, actual);
    	
    }
    @Test 
    public void testGetValueKeyNull(){
    	//int data = 5;
    	DefaultKeyedValues data = new DefaultKeyedValues();
    	data.setValue((Comparable)0, null); 
    	Number actual = data.getValue(0);  	
    	assertNull(actual);
    	
    }
    @Test 
    public void testGetKeyItemNull(){
    	//int data = 5;
    	DefaultKeyedValues data = new DefaultKeyedValues();
    	Comparable key = null;
    	data.setValue(key, 0); 
    	Comparable actual = data.getKey(0);  	
    	assertNull(actual);
    	
    }
}
