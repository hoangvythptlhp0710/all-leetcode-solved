package src.LythuyetDSA.HashTable;

import java.util.ArrayList;

public class HashMap {


    public class Data {
        int key;
        int value;

        Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof Data)
                return this.key == ((Data) other).key;
            return false;
        }
    }

        private final int size = 100;
        private ArrayList<Data> myBuckets[];

        public HashMap() {
            myBuckets = new ArrayList[size];
            for (int i = 0; i < myBuckets.length; i++) {
                myBuckets[i] = new ArrayList<>();
            }
        }

        private int hashFunction(int key) {
            return key % size;
        }

        public void put(int key, int value) {
            int hashValueIndex = hashFunction(key);
            var bucket = myBuckets[hashValueIndex];
            Data temp = new Data(key, value);
            int keyIndex = bucket.indexOf(temp);
            if (keyIndex >= 0) {
                bucket.get(keyIndex).value = value;
            } else {
                bucket.add(temp);
            }
        }

        public int get(int key) {
            int hashValueIndex = hashFunction(key);
            var bucket = myBuckets[hashValueIndex];
            Data search = new Data(key, 0);
            int keyIndex = bucket.indexOf(search);
            if (keyIndex >= 0){
                return bucket.get(keyIndex).value;
            }
            return -1;
        }

        public void remove(int key) {
            int hashValueIndex = hashFunction(key);
            var bucket = myBuckets[hashValueIndex];
            Data delete = new Data(key, 0);
            bucket.remove(delete);
        }
    }