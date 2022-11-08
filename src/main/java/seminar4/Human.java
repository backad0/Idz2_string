package seminar4;

public class Human {
    private String name, surname, patronymic;
    private Data dateOfBirth = new Data();

    public Human(String name,String surname, String patronymic, Data dateOfBirth){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth.setDay(dateOfBirth.getDay());
        this.dateOfBirth.setYear(dateOfBirth.getYear());
        this.dateOfBirth.setMonthByString(dateOfBirth.getMonth());
    }

    public Human(){
        this.name = "";
        this.surname = "";
        this.patronymic = "";
        this.dateOfBirth = new Data(1,1,2000);
    }

    public int getAge(Data realDate){
        if (!realDate.isPrevious(this.dateOfBirth)) throw new IllegalArgumentException("this person hasn't been born yet");
        int rYear = realDate.getYear(), bYear = this.dateOfBirth.getYear(), rMonth = realDate.getMonthCount(), bMonth = this.dateOfBirth.getMonthCount(), rDay = realDate.getDay(), bDay = this.dateOfBirth.getDay();
        if ((rMonth == bMonth)&(rDay>=bDay)) return (rYear - bYear);
        if ((rMonth == bMonth)&(rDay<bDay)) return (rYear - bYear - 1);
        if (rMonth > bMonth){ return (rYear - bYear);} else return (rYear - bYear - 1);
    }
}
