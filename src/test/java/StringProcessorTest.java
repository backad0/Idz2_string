import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class StringProcessorTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();
    //Testing getMultipliedString method//

    @Test
    public void getMultipliedString() {
        assertEquals("333", StringProcessor.getMultipliedString("3",3));
    }

    @Test
    public void getMultipliedString_returnEmpty() {
        assertEquals("", StringProcessor.getMultipliedString("3",0));
    }

    @Test
    public void getMultipliedString_illegalArgument1() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("n < 0!");
        StringProcessor.getMultipliedString("asd",-1);
    }

    @Test
    public void getMultipliedString_illegalArgument2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can`t be null");
        StringProcessor.getMultipliedString(null,3);
    }

    //Testing getNumberOfInputs method//

    @Test
    public void getNumberOfInputs(){
        assertEquals(3,StringProcessor.getNumberOfInputs("ababa","a"));
    }

    @Test
    public void getNumberOfInputs_illegalArgument1(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Target can`t be null");
        StringProcessor.getNumberOfInputs("ababa",null);
    }

    @Test
    public void getNumberOfInputs_illegalArgument2(){
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Target can`t be empty");
        StringProcessor.getNumberOfInputs("ababa","");
    }

    //Testing convertNumbersToWords method//

    @Test
    public void testConvertNumbersToWords() {
        assertEquals("onetwothree", StringProcessor.convertNumbersToWords("123"));
    }

    @Test
    public void testConvertNumbersToWords1() {
        assertEquals("oneaatwoaathreeaathreethreethree", StringProcessor.convertNumbersToWords("1aa2aa3aa333"));
    }

    @Test
    public void testConvertNumbersToWords_withException1() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can`t be empty");
        StringProcessor.convertNumbersToWords("");
    }

    @Test
    public void testConvertNumbersToWords_withException2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can`t be null");
        StringProcessor.convertNumbersToWords(null);
    }

    //Testing deleteEverySecondNumber method//
    @Test
    public void testDeleteEverySecondNumber() {
        StringBuilder str = new StringBuilder("AaBbCcDdEe");
        StringProcessor.deleteEverySecondNumber(str);
        assertEquals("ABCDE", str.toString());
    }

    @Test
    public void testDeleteEverySecondNumber_withException1() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can`t be null");
        StringProcessor.deleteEverySecondNumber(null);
    }

    @Test
    public void testDeleteEverySecondNumber_withException2() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("String can`t be empty");
        StringBuilder str = new StringBuilder("");
        StringProcessor.deleteEverySecondNumber(str);
    }
}
