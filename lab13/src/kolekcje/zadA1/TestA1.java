package kolekcje.zadA1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestA1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("fdgd");
        list.add("FFGERG");
        list.add("aaa");
        printUnique(list);
    }

    public static <T> void printUnique(Collection<T> items){
        HashSet<T> temp = new HashSet<>(items);
        for(var elem: temp){
            System.out.println(elem);
        }
    }
}
