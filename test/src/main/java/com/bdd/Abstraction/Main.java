package com.bdd.Abstraction;

public class Main {
    public static void main (String[] args){
        WashingMachine myWashingMachine = new WashingMachine();
        myWashingMachine.turnOn();
        myWashingMachine.turnOff();
        myWashingMachine.sound(); // method overriding of parent class which is Appliance since it is extended by WashingMachine
    }
    
}
