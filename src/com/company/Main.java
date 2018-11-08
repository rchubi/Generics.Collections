package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
////  Collection
//        List<Integer> collection = new ArrayList();
//        Task1 task1 = new Task1(collection);
//        task1.randomIntToCollection();
//        task1.fillingOfNewCollection();
//        task1.insertNewVariable();
//        task1.removeElementivMoreTwenty();
//        task1.sortCollection();

//      Map
        Map<Integer, String> employeeMap = new HashMap<Integer, String>();
        Task2Map task2Map = new Task2Map(employeeMap);
        task2Map.inputKeyName();
//        task2Map.chekByKey();
        task2Map.chekByName();

    }
}
