package com.dat19c;

public class AdministrationPersonnel extends Employee {
    int vacation = 5;

    public AdministrationPersonnel() {
    }

    public AdministrationPersonnel(String name, String cpr) {
        super(name, cpr);
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    @Override
    public int getSalary() {
        salary = 23000;
        return super.getSalary();
    }

    @Override
    public int getHours() {
        hours = 37;
        return super.getHours();
    }


}
