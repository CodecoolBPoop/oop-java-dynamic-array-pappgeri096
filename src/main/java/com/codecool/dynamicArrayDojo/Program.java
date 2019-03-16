package com.codecool.dynamicArrayDojo;

public class Program {

    public static void main(String[] args) {

        DynamicIntArray dynamicIntArray = new DynamicIntArray();
        dynamicIntArray.add(1);
        dynamicIntArray.add(2);
        dynamicIntArray.add(3);
        dynamicIntArray.add(3);
        dynamicIntArray.add(3);
        dynamicIntArray.add(3);
        dynamicIntArray.add(3);
        dynamicIntArray.add(9);
        dynamicIntArray.remove(9);
        System.out.println(dynamicIntArray.toString());
    }
}
