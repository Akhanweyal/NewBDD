package com.bdd.Abstraction;

public class WashingMachine extends Appliance {
   
    @Override
    void turnOn(){
        System.out.println("Washing Machine is on");
    }
    @Override
    void turnOff(){
        System.out.println("washing matchine is off");
    }
}
