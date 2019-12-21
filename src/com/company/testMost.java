package com.company;

public class testMost {
    public static void main(String[] args) {
        int[] array = new int[]{3,55,43,76,44};
        int max = array[1];
        for (int i : array) {
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
