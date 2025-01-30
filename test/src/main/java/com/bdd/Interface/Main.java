package com.bdd.Interface;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();// multiple inheritance uisng interface
        dog.eat();// multiple inheritance
        cat.makeSound(); // one inheritance using interface
    }

}
