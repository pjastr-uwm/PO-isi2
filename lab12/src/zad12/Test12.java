package zad12;

import java.util.Arrays;

public class Test12 {

    public static void main(String[] args) {
        Integer[] tab = {3,-4,9,10,34};
        swap(tab, 2,3);
        System.out.println(Arrays.toString(tab));
        String[] words = {"AA", "TT", "HH", "jjhfherhf"};
        swap(words, 0,3);
        System.out.println(Arrays.toString(words));
    }

    public  static <T> void swap(T[] array, int ind1, int ind2){
        if (array == null || array.length == 0){
            throw  new IllegalArgumentException("Tablica jest null lub jest pusta");
        }
        if (ind1 <0 || ind1>= array.length || ind2<0 || ind2>= array.length){
            throw new IllegalArgumentException("Błędny indeks");
        }
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }
}
