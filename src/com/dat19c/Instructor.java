package com.dat19c;

public class Instructor extends Employee {

    public Instructor() {
    }

    public Instructor(String name, String cpr) {
        super(name, cpr);
    }

    @Override
    public int getSalary() {
        for (int i=0; i<hours; i++){
            salary+=456;
        }
        return super.getSalary();
    }
}
