import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class absoluteTests
{
    @Test
    public void testSignedValueOf1(){
        int result = absolute.absoluteValueOf(-1);
        assertTrue(result + " - Thats not the absolute value of -1.", result == 1);
    }

    @Test
    public void testUnsignedValueOf1(){
        int result = absolute.absoluteValueOf(1);
        assertTrue(result + " - Thats not the absolute value of 1.", result == 1);
    }

    @Test
    public void testZero(){
        int result = absolute.absoluteValueOf(0);
        assertTrue(result + " - Thats not the absolute value of 0.", result == 0);
    }

    @Test
    public void testSignedValueOf2(){
        int result = absolute.absoluteValueOf(-2);
        assertTrue(result + " - Thats not the absolute value of -2.", result == 2);
    }

    @Test
    public void testUnsignedValueOf2(){
        int result = absolute.absoluteValueOf(2);
        assertTrue(result + " - Thats not the absolute value of 2.", result == 2);
    }
}
