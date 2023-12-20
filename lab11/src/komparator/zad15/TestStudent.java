package komparator.zad15;

import java.util.ArrayList;

public class TestStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(234, "AA", 5.0));
        list.add(new Student(111, "BB", 4.3));
        list.add(new Student(333, "CC", 4.2));
        list.add(new Student(566, "DD", 2.8));
        list.add(new Student(852, "EE", 5.0));
        for(var elem: list){
            System.out.println(elem);
        }
        list.sort(new AverageGradeComparator().thenComparing(new IdComparator()));
        System.out.println("After sorting");
        for(var elem: list){
            System.out.println(elem);
        }
        list.sort(new AverageGradeComparator());
        System.out.println("After sorting2");
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
