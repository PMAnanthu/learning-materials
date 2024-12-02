package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        //String output = Program.caesarCypherEncryptor("xyz", 2);
        //System.out.println(output);
        int[] a={2,3,2,2};
        majorityElement(a);
    }
    public static int majorityElement(int[] array) {
        AtomicInteger maj= new AtomicInteger();
        HashMap<Integer,Integer> res=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (res.containsKey(array[i])){
                res.put(array[i],res.get(array[i])+1 );
            }else {
                res.put(array[i],1);
            }
        }
        Optional<Map.Entry<Integer, Integer>> ress = res.entrySet().stream().max(Map.Entry.comparingByValue());
        System.out.println("MAJ"+ress.get().getKey());
        for (Map.Entry<Integer,Integer> p: res.entrySet()) {
            System.out.println(p.getKey()+" "+p.getValue());
        }

        res.forEach((key, value) -> System.out.println(key + " " + value));
        return -1;
    }
}