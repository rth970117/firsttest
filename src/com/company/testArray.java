package com.company;

public class testArray {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                array[i][j] = (int)(Math.random()*100);
            }
        }
        int max = array[0][0];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(array[i][j]>max){
                    max = array[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
