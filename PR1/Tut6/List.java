package Tut6;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        List list = new List();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      for (int i = 0; i < n;i++) list.add(i);
            list.print();
            list.remove(3);
            list.remove(7);
            list.print();
        System.out.println(list.get(1));

    }

    public int [] els;
    public int size;
    public List(){
        els = new int[0];
        size = 0;
    }

    public void add(int val){
        size++;
        if (size > els.length){
            int[] temp = new int[size*2];
            for (int i = 0; i < size - 1;i++){
                temp[i] = els[i];
            }
            els = temp;
        }
        els[size - 1] = val;
    }
    public void remove(int index){
        size--;
        int j = 0;
        for (int i = 0; i < size; i++){
            if (j == index) j++;
            els[i] = els[j];
            j++;
        }
    }
    public int get(int index){
        return els[index];
    }
    public void print(){
        for (int i = 0; i < size; i++){
            System.out.print(els[i] + " ");
        }
        System.out.println();
    }
}
