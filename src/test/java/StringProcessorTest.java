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
}
