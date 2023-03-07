import seminar4.Data;
import seminar4.Human;

import java.util.Objects;

public class Payment {
    private String fullName;
    private long payment;
    private Data dateOfPayment;

    public Payment() {
        this.fullName = "Ivanov Ivan Ivanovich";
        this.dateOfPayment = new Data(1, 1, 2000);
        this.payment = 0;
    }

    public Payment(long payment, String fullName, Data dateOfPayment) {
        this.fullName = fullName;
        this.dateOfPayment = dateOfPayment;
        this.payment = payment;
    }

    public Payment(long payment, Human person, Data dateOfPayment) {
        this.fullName = new StringBuilder(person.getSurname()).append(" ").append(person.getName()).append(" ").append(person.getPatronymic()).toString();
        this.payment = payment;
        this.dateOfPayment = dateOfPayment;
    }

    public String getFullName() {
        return fullName;
    }

    public long getPayment() {
        return payment;
    }

    public Data getDateOfPayment() {
        return dateOfPayment;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPayment(long payment) {
        this.payment = payment;
    }

    public void setDateOfPayment(Data dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public boolean equals(Payment payment) {
        if ((this.dateOfPayment.equals(payment.getDateOfPayment())) & (this.fullName.equals(payment.getFullName())) & (this.payment == payment.getPayment()))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, payment, dateOfPayment);
    }

    public String toString(){
        return new StringBuilder(this.fullName).append(" paid "+this.payment+" in "+this.dateOfPayment.getMonthCount()+"."+this.dateOfPayment.getDay()+"."+this.dateOfPayment.getYear()+".").toString();
    }
}
