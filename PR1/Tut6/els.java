package Tut6;

import java.util.ArrayList;
import java.util.List;

public class els {
    List<String> test = new ArrayList<String>();
    int a = test.size();
    public els(){
        this.a = 0;
        this.test = test;
    }

    public void add(String s){
        test.add(s);
    }
    public void remove(String d){
        test.remove(d);
    }
    
    public void get(int i){
        while (i < test.size()){

        }
    }
}
