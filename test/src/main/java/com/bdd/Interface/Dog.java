package com.bdd.Interface;

public class Dog implements Animal, Eat{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    
}
