package kolekcje.zadL1;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class TestL1 {

    public static void main(String[] args) {
        TreeMap<String, Double> t1 = new TreeMap<>();
        t1.put("AA", 6.7);
        t1.put("kk", 7.8);
        t1.put("ĄĄ", -11.2);
        t1.put("rr", 14.8);
        t1.put("55", 2.0);
        System.out.println(t1);
        Algorithm a1 = new Algorithm();
        TreeMap<String, Double> result = a1.subMapInRange(t1, "EE", "ĄĄ");
        System.out.println(result);
        TreeMap<Integer, String> t2 = new TreeMap<>();
        t2.put(4, "AA");
        t2.put(5, "ffg");
        t2.put(-3, "fgfgd");
        t2.put(22, "ggdf");
        t2.put(-89, "kjjhk");
        System.out.println(t2);
        TreeMap<Integer, String> result2 = a1.subMapInRange(t2, 0, 10);
        System.out.println(result2);

    }
}
