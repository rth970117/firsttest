package com.company.FirstClass;

public class ADHero extends Hero {
    //方法的重载
    public void attack(){
        System.out.println(name + "A到了一个人，但是不知道是谁");
    }

    /*public void attack(Hero h1){
        System.out.println(name + "A到了英雄"+h1.name);
    }*/

    /*public void attack(Hero h1,Hero h2){
        System.out.println(name + "A到了英雄"+h1.name+"和英雄"+h2.name);
    }*/

    public void attack(Hero... heros){
        for(int i = 0; i < heros.length; i++){
            System.out.println(name + "攻击了" + heros[i].name);
        }
    }
    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金";

        Hero h1 = new Hero();
        h1.name = "盖伦";

        Hero h2 = new Hero();
        h2.name = "猫咪";

        bh.attack(h1);
        bh.attack(h1,h2);


    }
}
