package com.company;

public class testGold {
    public static void main(String[] args) {
        double y = 1.00;
        int lasti = 0;
        int lastj = 0;
        for(int i=1;i<=10;i++)
        {
            for(int j = 20;j>10;j--)
            {
                if((i%2==0&&j%2==0)==false)
                {
                    double num = i*1.0/j;
                    double x = Math.abs(num - 0.618);
                    if(x<y) {
                        y = x;
                        lasti = i;
                        lastj = j;
                    }
                }
            }
        }
        System.out.println(lastj+"值为"+lasti);
    }
}
