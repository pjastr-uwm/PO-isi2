package kolekcje.zadK1;

import java.util.HashMap;

public class TestK1 {

    public static void main(String[] args) {
        Alg a1 = new Alg();
        HashMap<Integer, String> h1 = new HashMap<>();
        h1.put(1, "abc");
        h1.put(20, "XY");
        h1.put(3, "abc");
        System.out.println(h1);
        HashMap<String, Integer> result = a1.countValueOccurrences(h1);
        System.out.println(result);
    }
}
