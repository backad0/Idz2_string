import org.junit.Test;
import seminar4.Data;

import static org.junit.Assert.*;

public class FinanceReportTest {

    @Test
    public void copy() {
        int arrayL = 3;
        FinanceReport fr1 = new FinanceReport(new Payment[arrayL], "Andrey", new Data(12,5,2022));
        for (int i = 0; i < arrayL; i++){
            fr1.setPayment(new Payment(i,"Andrey", new Data(i+1,1,2022)), i);
        }
        FinanceReport fr2 = new FinanceReport(fr1);

        fr2.setPayment(new Payment(),0);
        assertEquals(false, fr1.equals(fr2));
    }
}
