package com.company;

public class test3 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int t = 0;

        for (int i = 0; i<  array.length/2; i++) {
            t = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = t;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
