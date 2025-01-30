package com.bdd.PolyMorphisim;

// Derived class
public class Cat extends Animal {
    @Override // method overriding
    public void sound() {
        System.out.println("Meow");

    }
// method overloading where we use the same method name but with different parameters
public void sound(String name){
    System.out.println("cat name is: " + name);
}
}
    