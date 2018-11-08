package com.company;

import java.util.*;

/**
 * Created by Roman on 06.11.2018.
 */
public class Task2Map {
    private Map<Integer, String> employeeMap;
    private final Scanner scanner;
    private int key;
    private String name;

    public Task2Map(Map<Integer, String> employeeMap) {
        this.employeeMap = employeeMap;
        scanner = new Scanner(System.in);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void inputKeyName() {
        employeeMap.put(1, "Roman");
        employeeMap.put(2, "Andryi");
        employeeMap.put(3, "Nastia");
        employeeMap.put(4, "Olya");
        employeeMap.put(5, "Oleg");
        employeeMap.put(6, "Ihor");
        employeeMap.put(7, "Ulyana");

        System.out.print("employeeMap = ");
        System.out.println(employeeMap);
    }

    public void chekByKey() {
        System.out.println("Input key: ");
        setKey(scanner.nextInt());
        if (employeeMap.containsKey(getKey())) System.out.println("name = " + employeeMap.get(getKey()));
        else System.out.println("employeeMap doesn't contain key - " + getKey());
    }

    public void chekByName() {
        System.out.println("Input name: ");
        setName(scanner.nextLine());
        List<String> values = new ArrayList<String>(employeeMap.values());
        if (employeeMap.containsValue(getName())) {
            for (int i=0; i < values.size(); i++) {
                if (values.get(i) == getName()) {
                    System.out.println("index = " + i);
                }
            }
        }
        else {
            System.out.println("employeeMap doesn't contain name - " + getName());
        }
    }
}
