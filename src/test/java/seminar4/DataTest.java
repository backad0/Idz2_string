package seminar4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DataTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void isPrevious1() {
        assertEquals(true,new Data("March",1,2000).isPreviousDay(new Data("February",29,2000)));
    }
    @Test
    public void isPrevious2() {
        assertEquals(true,new Data("January",1,2000).isPreviousDay(new Data("December",31,1999)));
    }
    @Test
    public void isPrevious3() {
        assertEquals(true,new Data("March",2,2000).isPreviousDay(new Data("March",1,2000)));
    }
    @Test
    public void isPrevious4() {
        assertEquals(false,new Data("March",2,2000).isPreviousDay(new Data("March",2,2000)));
    }
}
