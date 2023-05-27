package Lec10;

import java.util.HashMap;

public class hashmap_Demo {
    public static void main(String[] args) {
        HashMap<String, Integer> kv = new HashMap<>();
        String[] arr = {"con", "ngua", "da", "da", "con", "ngua", "da"};
        for (String s: arr){
            if (kv.containsKey(s)){
                int count = kv.get(s);
                kv.put(s,count +1);
            }
            else{
                kv.put(s,1);
            }
        }
        System.out.println(kv);
    }
}
