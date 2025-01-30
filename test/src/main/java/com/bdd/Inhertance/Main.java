package com.bdd.Inhertance;
// Main class to test polymorphism
// Main class to test inheritance
public class Main {
  public static void main(String[] args){
    Employee emp = new Employee("ajmal", 1)
    ;
    // emp.display();
    Manager man = new Manager("ajmal", 1, "IT");    
    man.display();
  }
}