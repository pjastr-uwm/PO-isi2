package porownywanie.zad1;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Jan", 4.2, 2001));
        list.add(new Student("Anna", 4.1, 2003));
        list.add(new Student("Sylwia", 4.5, 2002));
        list.add(new Student("Krzysztof", 4.2, 2004));
        list.add(new Student("Tomasz", 4.3, 1999));
        for(var elem:list){
            System.out.println(elem);
        }
        Collections.sort(list);
        System.out.println("After sort");
        for(var elem:list){
            System.out.println(elem);
        }
    }
}
