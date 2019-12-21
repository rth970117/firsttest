package com.company;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("请输入你的身高：");
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        System.out.println("请输入你的体重：");
        int weight = sc.nextInt();
        double s = weight/(height*height);
        System.out.println("这位同学的BMI是："+ s);
    }
}
