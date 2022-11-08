package seminar4;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class HumanServiceTest {

    @Test
    public void getAllAdult() {
        Human[] humans = new Human[3];
        humans[0] = new Human("", "", "", new Data(1, 1, 2000));
        humans[1] = new Human("", "", "", new Data(1, 2, 2002));
        humans[2] = new Human("", "", "", new Data(1, 1, 2002));
        int[] array = new int[3];
        array[0] = 1;
        array[1] = -1;
        array[2] = -1;
        Data rDate = new Data(1, 1, 2018);
        assertArrayEquals(array, HumanService.getAllAdult(humans, rDate));
    }

    @Test
    public void getAllAges() {
        Human[] humans = new Human[3];
        humans[0] = new Human("", "", "", new Data(1, 1, 2000));
        humans[1] = new Human("", "", "", new Data(1, 2, 2002));
        humans[2] = new Human("", "", "", new Data(1, 1, 2002));
        int[] array = new int[3];
        array[0] = 18;
        array[1] = 15;
        array[2] = 16;
        Data rDate = new Data(1, 1, 2018);
        assertArrayEquals(array, HumanService.getAllAges(humans, rDate));
    }
}
