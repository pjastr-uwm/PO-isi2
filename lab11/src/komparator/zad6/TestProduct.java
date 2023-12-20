package komparator.zad6;

import java.util.ArrayList;

public class TestProduct {

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product(34, "AA", 34.5));
        list.add(new Product(43, "BB", 22.1));
        list.add(new Product(22, "CC", 55.4));
        list.add(new Product(11, "DD", 11.8));
        list.add(new Product(15, "AA", 34.5));
        for(var elem:list){
            System.out.println(elem);
        }
        list.sort(new PriceIdComparator());
        System.out.println("After sort");
        for(var elem:list){
            System.out.println(elem);
        }
    }
}
