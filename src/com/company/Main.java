package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 1;
        int j = ++i + i++ + ++i + ++i + i++;//18
        System.out.println(j);
    }
}
