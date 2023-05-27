package src.LythuyetDSA.HashTable;

import java.util.ArrayList;

public class HashSet {
    public final int SIZE = 1000;
    private ArrayList<Integer> Buckets[];
    HashSet(){
        Buckets = new ArrayList[SIZE];
        for (int i = 0; i < Buckets.length; i++) {
            Buckets[i] = new ArrayList<>();
        }
    }
    //return hash value
    private int hashFunction(int key){
        return key % SIZE;
    }

    public void add(int key){
        int hashvalueIndex = hashFunction(key);
        var bucket = Buckets[hashvalueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex < 0){
            bucket.add(key);
        }

    }

    public void remove(int key){
        int hashvalueIndex = hashFunction(key);
        var bucket = Buckets[hashvalueIndex];
        int keyIndex = bucket.indexOf(key);
        if (keyIndex >= 0){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key){
        int hashvalueIndex = hashFunction(key);
        var bucket = Buckets[hashvalueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.remove(1);
        System.out.println(hashSet);
    }
}
