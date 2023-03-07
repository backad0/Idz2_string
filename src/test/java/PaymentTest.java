import org.junit.Test;
import seminar4.Data;

import static org.junit.Assert.assertEquals;

public class PaymentTest {

    @Test
    public void testEquals1() {
        assertEquals(true, (new Payment(10000, "Ivan Ivanovich Ivanov", new Data(1,1,2022))).equals(new Payment(10000, "Ivan Ivanovich Ivanov", new Data(1,1,2022))));
    }
    @Test
    public void testEquals2() {
        assertEquals(false, (new Payment(10000, "Ivan Ivanovich Ivanov", new Data(1,1,2022))).equals(new Payment(1000, "Ivan Ivanovich Ivanov", new Data(1,1,2022))));
    }
    @Test
    public void testEquals3() {
        assertEquals(false, (new Payment(10000, "Andrey Ivanovich Ivanov", new Data(1,1,2022))).equals(new Payment(10000, "Ivan Ivanovich Ivanov", new Data(1,1,2022))));
    }
    @Test
    public void testEquals4() {
        assertEquals(false, (new Payment(10000, "Ivan Ivanovich Ivanov", new Data(1,2,2022))).equals(new Payment(10000, "Ivan Ivanovich Ivanov", new Data(1,1,2022))));
    }

    @Test
    public void testToString() {
        Payment pay = new Payment();
        assertEquals("Ivanov Ivan Ivanovich paid 0 in 1.1.2000.", pay.toString());
    }
}
