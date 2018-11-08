package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Roman on 06.11.2018.
 */
public class Task1 {
    private List<Integer> myCollection;
    private List<Integer> newCollection;

    public Task1(List<Integer> myCollection) {
        this.myCollection = myCollection;
        newCollection = new ArrayList<Integer>();
    }

    public void randomIntToCollection() {
        Random random = new Random();

        for(int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(50));
        }
        System.out.print("myCollection = ");
        System.out.println(myCollection);
    }

    public void fillingOfNewCollection() {
        for (Integer element: myCollection ) {
            if (element > 5) newCollection.add(element);
        }
        System.out.print("newCollection = ");
        System.out.println(newCollection);
    }

    public void removeElementivMoreTwenty() {
        for (int i=0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(myCollection.get(i));
                i--;
            }
        }
        System.out.print("myCollection= ");
        System.out.println(myCollection);
    }

    public void insertNewVariable() {
        myCollection.set(2, 1);
        myCollection.set(8, -3);
        myCollection.set(5, -4);
        System.out.print("After insert into myCollection: ");
        System.out.println(myCollection);
    }

    public void sortCollection() {
        Collections.sort(myCollection);
        System.out.println("myCollection= ");
        System.out.println(myCollection);
    }
}
