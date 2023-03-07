import seminar4.Data;
import seminar4.Human;

public class FinanceReport {
    private Payment[] payments;
    private String cFullName;
    private Data reportDate;

    public FinanceReport(){
        this.payments = new Payment[0];
        this.cFullName = "Ivanov Ivan Ivanovich";
        reportDate = new Data(1,1,2020);
    }

    public FinanceReport(Payment[] payments, String cFullName, Data reportDate){
        this.payments = new Payment[payments.length];
        for (int i = 0; i<payments.length; i++){
            this.payments[i] = payments[i];
        }
        this.cFullName = cFullName;
        this.reportDate = reportDate;
    }

    public FinanceReport(Payment[] payments, Human creator, Data reportDate){
        this.payments = new Payment[payments.length];
        for (int i = 0; i<payments.length; i++){
            this.payments[i] = payments[i];
        }
        this.cFullName = new StringBuilder(creator.getSurname()+" "+creator.getName()+" "+creator.getPatronymic()).toString();
        this.reportDate = reportDate;
    }

    public int getCountOfPayments(){
        return this.payments.length;
    }

    public Payment getPayment(int num){
        if ((num<0)|(num>=this.payments.length)){ throw new IllegalArgumentException("number is out of array");}
        return this.payments[num];
    }

    public String getCFullName(){
        return this.cFullName;
    }

    public Data getReportDate() {
        return reportDate;
    }

    public void setPayment(Payment newOne, int num){
        if ((num<0)|(num>=this.payments.length)){ throw new IllegalArgumentException("number is out of array");}
        this.payments[num] = newOne;
    }

    public String toString(){
        String res = String.format("[Author: %s, date: %s, payments:\n[",cFullName, reportDate.toString());
        for (int i = 0; i<this.payments.length; i++){
            res+=String.format("Payer: %s, date: %s, sum: %d\n",this.payments[i].getFullName(),this.payments[i].getDateOfPayment().toString(),this.payments[i].getPayment());
        }
        res+="]]";
        return res;
    }

    public FinanceReport(FinanceReport fR){
        this.cFullName = fR.getCFullName();
        this.reportDate = new Data(fR.getReportDate().getMonthCount(),fR.getReportDate().getDay(),fR.getReportDate().getYear());
        this.payments = new Payment[fR.getCountOfPayments()];
        for (int i = 0; i < this.payments.length; i++){
            this.payments[i] = fR.getPayment(i);
        }
    }
    public boolean equals(FinanceReport comp) {
        if (this == comp) return true;
        if (comp == null) return false;
        if ((this.reportDate.equals(comp.getReportDate()))&(this.payments.length == comp.getCountOfPayments())&(this.cFullName.equals(comp.cFullName))){
            for (int i = 0; i<this.payments.length; i++){
                if (!this.payments[i].equals(comp.getPayment(i))) return false;
            }
        } else return false;
        return true;
    }
}
