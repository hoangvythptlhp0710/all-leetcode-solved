package Tut8;

import java.util.ArrayList;

public class act3 {
    public static void removeEvenLength(ArrayList<String> arrList){
        for (int i = arrList.size()-1; i>= 0; i--){
            if (arrList.get(i).length() % 2 == 0){
                arrList.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("1");
        arrList.add("10");
        arrList.add("100");
        arrList.add("1000");
        arrList.add("10000");
        arrList.add("100000");
        arrList.add("1000000");
        arrList.add("10000000");
        removeEvenLength(arrList);
        for (String s : arrList){
            System.out.println(s);
        }
    }
}
