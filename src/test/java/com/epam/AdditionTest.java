package com.epam;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;


/**
* The test class for Addition class.
*
* @author  Mangesh Gawade
* @version 1.0
* @since   2018-04-02 
*/
class AdditionTest {

	
	/**
	* The test case to check empty string.
	*/
	  @Test
	   public void testAddEmptySting() {	
		  Addition addition=new Addition();
	      int result = addition.add("");
	      assertEquals(0,result);     
	   }
	  
	  /**
		* The test case to check one number in string.
		*/
	  @Test
	   public void testAddOneNumber() {	
		  Addition addition=new Addition();
	      int result = addition.add("1");
	      assertEquals(1,result);     
	   }

}
