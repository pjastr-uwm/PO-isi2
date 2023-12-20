package komparator.zad1;

import java.util.Arrays;

public class TestOsoba {

    public static void main(String[] args) {
        Osoba[] tab = new Osoba[5];
        tab[0] = new Osoba("AA", 45, 156);
        tab[1] = new Osoba("BB", 21, 167);
        tab[2] = new Osoba("AA", 33, 172);
        tab[3] = new Osoba("CC", 44, 156);
        tab[4] = new Osoba("DD", 21, 156);
        for(var elem: tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new WiekComparator());
        System.out.println("Aftre sorting");
        for(var elem: tab){
            System.out.println(elem);
        }
    }
}
