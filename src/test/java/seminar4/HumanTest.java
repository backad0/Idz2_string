package seminar4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class HumanTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void getAge1() {
        Human person = new Human("Ivan", "Ivanovich", "Ivanov", new Data(1,1,2000));
        assertEquals(20,person.getAge(new Data("January",1,2020)));
    }

    @Test
    public void getAge2() {
        Human person = new Human("Ivan", "Ivanovich", "Ivanov", new Data(2,1,2000));
        assertEquals(19,person.getAge(new Data(1,1,2020)));
    }

    @Test
    public void getAge3() {
        Human person = new Human("Ivan", "Ivanovich", "Ivanov", new Data(2,1,2000));
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("this person hasn't been born yet");
        person.getAge(new Data(1,1,2000));
    }
}
