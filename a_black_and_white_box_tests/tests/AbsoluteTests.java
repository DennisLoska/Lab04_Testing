import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AbsoluteTests
{
    @Test
    public void testSignedValueOf1(){
        int result = Absolute.absoluteValueOf(-1);
        assertTrue(result + " - Thats not the Absolute value of -1.", result == 1);
    }

    @Test
    public void testUnsignedValueOf1(){
        int result = Absolute.absoluteValueOf(1);
        assertTrue(result + " - Thats not the Absolute value of 1.", result == 1);
    }

    @Test
    public void testZero(){
        int result = Absolute.absoluteValueOf(0);
        assertTrue(result + " - Thats not the Absolute value of 0.", result == 0);
    }

    @Test
    public void testSignedValueOf2(){
        int result = Absolute.absoluteValueOf(-2);
        assertTrue(result + " - Thats not the Absolute value of -2.", result == 2);
    }

    @Test
    public void testUnsignedValueOf2(){
        int result = Absolute.absoluteValueOf(2);
        assertTrue(result + " - Thats not the Absolute value of 2.", result == 2);
    }

    @Test
    public void testMaxValue(){
        int result = Absolute.absoluteValueOf(Integer.MAX_VALUE);
        assertTrue(result + " - Thats not the Absolute value of MAX_VALUE.", result == Integer.MAX_VALUE);
    }

    @Test
    public void testMinValue(){
        int result = Absolute.absoluteValueOf(Integer.MIN_VALUE);
        assertTrue(result + " - Thats not the Absolute value of MIN_VALUE.", result == Integer.MAX_VALUE+1);
    }
}
