package com.dat19c;

import java.util.ArrayList;
import java.util.Collection;


public class Oversigt {


    ArrayList<Person> personArrayList = new ArrayList<>();

    public void addToList(){

        Instructor instructor = new Instructor("Erik", "220695-1234");
        instructor.setHours(5);
        Instructor instructor2 = new Instructor("Lars", "290590-4321");
        instructor.setHours(15);
        AdministrationPersonnel administrationPersonnel = new AdministrationPersonnel("Frederik", "270790-0465");
        AdministrationPersonnel administrationPersonnel2 = new AdministrationPersonnel("Kristoffer", "130588-7283");
        Member member = new Member("Trine", "081295-0942", true);
        Member member2 = new Member("Andreas", "011094-0943", false);

        personArrayList.add(instructor);
        personArrayList.add(administrationPersonnel);
        personArrayList.add(member);
        personArrayList.add(instructor2);
        personArrayList.add(administrationPersonnel2);
        personArrayList.add(member2);

    }
    public void printStar(){
        String star = "*";
        for (int i=0; i<88;i++){
            System.out.print(star);
        }
    }

    public void visOversigt(){
        String format = "%1$-20s%2$-20s%3$-20s%4$-20s%5$-20s\n";
        String format2 = "%1$-20s%2$-20s%3$-20s%4$-20s\n";
        System.out.println("FITNESS EMPLOYEES\n");
        System.out.format(format, "Name", "Cpr","Hour","Salary","Vactaion");
        printStar();
        System.out.println("\n");
        for (int i=0; i<personArrayList.size(); i++){
            Object obj = personArrayList.get(i);

            if(obj instanceof AdministrationPersonnel) {
                //String employeeString =((Employee) obj).name + ((Employee) obj).cpr + .salary ;
                System.out.format(format, ((Employee) obj).name, ((Employee) obj).cpr, ((Employee) obj).hours, ((Employee) obj).cpr, ((AdministrationPersonnel) obj).vacation);
            }

            else if(obj instanceof Employee) {
                //String employeeString =((Employee) obj).name + ((Employee) obj).cpr + .salary ;
                System.out.format(format2, ((Employee) obj).name, ((Employee) obj).cpr, ((Employee) obj).hours, ((Employee) obj).cpr);
            }
        }

        System.out.println("\nFITNESS MEMBERS\n");
        System.out.format(format2, "Name", "Cpr","Member type","Fee");
        printStar();
        System.out.println("\n");
        for (int i=0; i<personArrayList.size(); i++){
            Object obj = personArrayList.get(i);
            if(obj instanceof Member) {
                System.out.format(format2, ((Member) obj).name, ((Member) obj).cpr, ((Member) obj).memberShip(), ((Member) obj).monthlyFee() );
            }

        }
    }

}
