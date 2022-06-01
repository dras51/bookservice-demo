package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        SDAArrayList<Integer> arrayList = new SDAArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);

        ArrayList<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        Set<Integer> set = new HashSet<Integer>(list);


        System.out.println(set);

        ArrayList<Integer> newlist = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)) {
                    newlist.add(list.get(i));
                    list.set(j, null);
                }
            }

            list.set(i, null);
        }

        System.out.println(newlist);


//        System.out.println(arrayList);
    }

    void add() {
        //do some add operations
    }
}
