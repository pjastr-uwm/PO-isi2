package zad15;

public class Test15 {

    public static void main(String[] args) {
        Integer[] t1 = { 3,-4,11,-20,34};
        System.out.println(Algorithm.maxValue(t1));

        Vehicle[] t2 = new Vehicle[3];
        t2[0] = new Vehicle("AA", 45);
        t2[1] = new Vehicle("XX", 22);
        t2[2] = new Vehicle("DD", 33);

        System.out.println(Algorithm.maxValue(t2));

    }
}
