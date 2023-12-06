package zlozone.zad3;

public class TestComputerGame {

    public static void main(String[] args) {
        double[] tab = {4.5, 3.9, 7.2};
        ComputerGame c1 = new ComputerGame("A", "X", tab);
        System.out.println(c1);
        ComputerGame c2 = new ComputerGame("A", "X", new double[]{4.5, 3.9, 7.2});
        System.out.println(c1.equals(c2));
    }
}
