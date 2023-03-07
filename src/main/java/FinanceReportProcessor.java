import java.util.ArrayList;

public class FinanceReportProcessor {
    public static FinanceReport getByFLSN(char fl, FinanceReport fr){
        ArrayList<Payment> aL = new ArrayList<Payment>();
        for (int i = 0; i<fr.getCountOfPayments(); i++){
            StringBuilder sb = new StringBuilder(fr.getPayment(i).getFullName());
            if (fl == sb.charAt(0)){
                aL.add(fr.getPayment(i));
            }
        }
        return new FinanceReport(aL.toArray(new Payment[0]), fr.getCFullName(), fr.getReportDate());
    }

    public static FinanceReport getByPaySum(int pay,FinanceReport fr){
        ArrayList<Payment> aL = new ArrayList<Payment>();
        for (int i = 0; i< fr.getCountOfPayments(); i++) {
            if (fr.getPayment(i).getPayment() < pay) {
                aL.add(fr.getPayment(i));
            }
        }
        return new FinanceReport((aL.toArray(new Payment[0])), fr.getCFullName(), fr.getReportDate());
    }
}
