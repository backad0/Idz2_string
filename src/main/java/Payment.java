import seminar4.Data;
import seminar4.Human;

public class Payment {
    private String fullName;
    private int payment;
    private Data dateOfPayment;

    public Payment(){
        this.fullName = "Ivan Ivanovich Ivanov";
        this.dateOfPayment = new Data(1,1,2000);
        this.payment = 0;
    }

    public Payment(int payment, String fullName, Data dateOfPayment){
        this.fullName = fullName;
        this.dateOfPayment = dateOfPayment;
        this.payment = payment;
    }

    public Payment(int payment, Human person, Data dateOfPayment){
        this.fullName = new StringBuilder(person.getName()).append("").append(person.getSurname()).append("").append(person.getPatronymic()).toString();
        this.payment = payment;
        this.dateOfPayment = dateOfPayment;
    }
}
