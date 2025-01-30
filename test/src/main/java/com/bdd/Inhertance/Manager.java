package com.bdd.Inhertance;
// Derived class
public class Manager extends Employee {
    private String department;
public Manager(String name, int age, String department){
    super(name,age);
    this.department = department;
}
@Override
public void display(){
    super.display();
    System.out.println("dopartment is: " + department);
}

}