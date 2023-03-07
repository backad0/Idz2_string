package seminar4;

public class Human {
    private String name, surname, patronymic;
    private Data dateOfBirth = new Data();

    public Human(String name,String surname, String patronymic, Data dateOfBirth){
        if (name == null ) throw new IllegalArgumentException("name can't be null");
        if (surname == null ) throw new IllegalArgumentException("surname can't be null");
        if (dateOfBirth == null ) throw new IllegalArgumentException("date can't be null");
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateOfBirth.setMonthByString(dateOfBirth.getMonth());
        this.dateOfBirth.setDay(dateOfBirth.getDay());
        this.dateOfBirth.setYear(dateOfBirth.getYear());
    }

    public Human(){
        this.name = "";
        this.surname = "";
        this.patronymic = "";
        this.dateOfBirth = new Data(1,1,2000);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Data getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge(Data realDate){
        if (realDate == null ) throw new IllegalArgumentException("date can't be null");
        if (!realDate.isPrevious(this.dateOfBirth)) throw new IllegalArgumentException("this person hasn't been born yet");
        int rYear = realDate.getYear(), bYear = this.dateOfBirth.getYear(), rMonth = realDate.getMonthCount(), bMonth = this.dateOfBirth.getMonthCount(), rDay = realDate.getDay(), bDay = this.dateOfBirth.getDay();
        if ((rMonth == bMonth)&(rDay>=bDay)) return (rYear - bYear);
        if ((rMonth == bMonth)&(rDay<bDay)) return (rYear - bYear - 1);
        if (rMonth > bMonth){ return (rYear - bYear);} else return (rYear - bYear - 1);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && surname.equals(human.surname) && patronymic.equals(human.patronymic) && dateOfBirth.equals(human.dateOfBirth);
    }
}
