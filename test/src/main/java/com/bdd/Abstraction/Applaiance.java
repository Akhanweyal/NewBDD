package com.bdd.Abstraction;


abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
    public void sound(){
        System.out.println("Appliance is making a sound");
    }
}