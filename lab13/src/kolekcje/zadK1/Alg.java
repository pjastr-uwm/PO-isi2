package kolekcje.zadK1;

import java.util.HashMap;

public class Alg {

    public <K,V> HashMap<V, Integer> countValueOccurrences(HashMap<K,V> arg){
        HashMap<V, Integer> temp = new HashMap<>();
        for(var values: arg.values()){
            int counter =0;
            for(var values2: arg.values()){
                if (values.equals(values2)){
                    counter++;
                }
            }
            temp.put(values, counter);
        }

        return temp;
    }
}
