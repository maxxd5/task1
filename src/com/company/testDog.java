package com.company;
public class testDog {
    public static void main(String[] args){
        Dog d1 = new Dog("Firstie", 2);
        Dog d2 = new Dog("Second", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}