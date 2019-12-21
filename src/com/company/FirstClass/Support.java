package com.company.FirstClass;

public class Support extends Hero {

    public void heal(){
        System.out.println(name + "治疗量为");
    }

    public void heal(Hero h1){
        System.out.println(name + "治疗了" + h1.name);
    }

    public void heal(Hero h1,int hp){
        System.out.println(name + "治疗了" + h1.name + "的血量为" + hp);
    }
    public static void main(String[] args) {
        Support sp = new Support();
        sp.name = "星妈";

        Hero h1 = new Hero();
        h1.name = "盖伦";

        sp.heal();
        sp.heal(h1);
        sp.heal(h1,400);
    }
}
