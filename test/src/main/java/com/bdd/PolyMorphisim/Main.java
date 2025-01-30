package com.bdd.PolyMorphisim;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog(); 
        dog.sound();// method overriding of child class
        Cat cat = new Cat();
        cat.sound();// method overriding of child class
        cat.sound("Tom");// method overloading
    }
}
