package com.company;

public class Armor extends Item {
    int ac;

    public Armor() {

    }

    public Armor(String name, int price, int ac) {
        this.name = name;
        this.price = price;
        this.ac = ac;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "ac=" + ac +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Armor armor1 = new Armor("布甲", 300, 15);
        Armor armor2 = new Armor("锁子甲", 500, 40);
        System.out.println(armor1);
        System.out.println(armor2);

        //System.out.println(armor1.toString());
        //System.out.println(armor2.toString());
    }

}