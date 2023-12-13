package interfejsy.zad4;

import java.util.ArrayList;

public class TestConverter {

    public static void main(String[] args) {
        CurrencyConverter c1 = new CurrencyConverter();
        System.out.println(c1.convertToEuro(5));
        ArrayList<Converter> list = new ArrayList<>();
        list.add(new CurrencyConverter());
        list.add(new UnitConverter());
        for(var elem: list){
            System.out.println(elem.convertToUSD(45));
        }
    }
}
