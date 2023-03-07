package seminar4;

import java.util.ArrayList;

public class HumanService {
    public static ArrayList getAllAdult(Human[] humanList, Data rDate){
        if (rDate == null ) throw new IllegalArgumentException("date can't be null");
        if (humanList == null ) throw new IllegalArgumentException("list of people can't be null");
        ArrayList<Human> arrayList = new ArrayList<Human>();
        for (int i = 0; i < humanList.length; i++){
            if (humanList[i].getAge(rDate) >= 18) {arrayList.add(humanList[i]);}
            }
        return arrayList;
    }

    public static int[] getAllAges(Human[] humanList, Data rDate){
        if (rDate == null ) throw new IllegalArgumentException("date can't be null");
        if (humanList == null ) throw new IllegalArgumentException("list of people can't be null");
        int[] array = new int[humanList.length];
        for (int i = 0; i < humanList.length; i++){
            array[i] = humanList[i].getAge(rDate);
        }
        return array;
    }
}
