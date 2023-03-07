import org.junit.Test;
import seminar4.Data;

import static org.junit.Assert.assertEquals;

public class FinanceReportProcessorTest {

    @Test
    public void getByFLSN_Test() {
        FinanceReport fR1 = new FinanceReport(new Payment[3], "Sheliagin", new Data(12, 5, 2022));
        fR1.setPayment(new Payment(12,"Shelby", new Data(11,5 ,2022)), 0);
        fR1.setPayment(new Payment(12,"Sheliagin", new Data(12,5 ,2022)), 1);
        fR1.setPayment(new Payment(12,"Chmel", new Data(1,5 ,2023)), 2);

        FinanceReport fR2 = new FinanceReport(new Payment[2], "Sheliagin", new Data(12, 5, 2022));
        fR2.setPayment(new Payment(12,"Shelby", new Data(11,5 ,2022)), 0);
        fR2.setPayment(new Payment(12,"Sheliagin", new Data(12,5 ,2022)), 1);

        assertEquals(true, fR2.equals(FinanceReportProcessor.getByFLSN('S', fR1)));
    }

    @Test
    public void getByPaySum() {
        FinanceReport fR1 = new FinanceReport(new Payment[3], "Sheliagin", new Data(12, 5, 2022));
        fR1.setPayment(new Payment(13,"Shelby", new Data(11,5 ,2022)), 0);
        fR1.setPayment(new Payment(14,"Sheliagin", new Data(12,5 ,2022)), 1);
        fR1.setPayment(new Payment(15,"Chmel", new Data(1,5 ,2023)), 2);

        FinanceReport fR2 = new FinanceReport(new Payment[2], "Sheliagin", new Data(12, 5, 2022));
        fR2.setPayment(new Payment(13,"Shelby", new Data(11,5 ,2022)), 0);
        fR2.setPayment(new Payment(14,"Sheliagin", new Data(12,5 ,2022)), 1);

        assertEquals(true, fR2.equals(FinanceReportProcessor.getByPaySum(15, fR1)));
    }
}
