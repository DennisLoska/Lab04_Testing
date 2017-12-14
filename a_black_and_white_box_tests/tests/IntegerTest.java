//Alternative
//package de.lab.testing.IntegerTest;
//
//import junit.framework.*;
//import org.junit.Test;
//
//public class IntegerTest{
//    
// @Test
//   public void testValidValue()
//    {	
//	    //legal values
//	   
//    	//positive integers
//    	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(+1), 1);
//    	
//    	//neutral integers
//    	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(0), 0);
//    	
//    	//negative values
//    	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(-1), 1); 	
//}
// 
// 
//@Test
// public void testEdgeValue()
// {
//	//almost illegal - edge cases
//	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(-Integer.MAX_VALUE), Integer.MAX_VALUE);
//	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(Integer.MIN_VALUE), Integer.MIN_VALUE);
// }
// 
//
//@Test(expected = junit.framework.AssertionFailedError.class)
//public void testInvalidValue()
//{
//	// illegal - edge cases
//	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(-Integer.MAX_VALUE+1), Integer.MAX_VALUE+1);
//	Assert.assertEquals(AbsoluteInteger.absoluteValueOf(Integer.MIN_VALUE-1), Integer.MIN_VALUE-1);
//}
//
//}