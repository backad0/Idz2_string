package seminar4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class DataTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void isPreviousDay1() {
        assertEquals(true,new Data("March",1,2000).isPreviousDay(new Data("February",29,2000)));
    }
    @Test
    public void isPreviousDay2() {
        assertEquals(true,new Data("January",1,2000).isPreviousDay(new Data("December",31,1999)));
    }
    @Test
    public void isPreviousDay3() {
        assertEquals(true,new Data("March",2,2000).isPreviousDay(new Data("March",1,2000)));
    }
    @Test
    public void isPreviousDay4() {
        assertEquals(false,new Data("March",2,2000).isPreviousDay(new Data("March",2,2000)));
    }

    @Test
    public void settersTest(){
        Data date1 = new Data(1,1,2020);
        Data date2 = new Data();
        date2.setDay(date1.getDay());
        date2.setMonthByInt(date1.getMonthCount());
        date2.setYear(date1.getYear());
        assertEquals(true, date1.equals(date2));
    }

    @Test
    public void settersTest1(){
        Data date1 = new Data(2,29,2020);
        Data date2 = new Data(1,1,2001);

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("February cannot have more than 28 days");
        date2.setDay(date1.getDay());
        date2.setMonthByInt(date1.getMonthCount());
        date2.setYear(date1.getYear());
    }

    @Test
    public void settersTest2(){
        Data date1 = new Data(2,29,2020);
        Data date2 = new Data(1,1,2001);
        date2.setYear(date1.getYear());
        date2.setMonthByInt(date1.getMonthCount());
        date2.setDay(date1.getDay());
        assertEquals(true, date1.equals(date2));
    }

    @Test
    public void isPrevious1(){
        Data date1 = new Data(1,1,2000);
        Data date2 = new Data(1,1,1999);
        assertEquals(false, date1.equals(date2));
    }
}
