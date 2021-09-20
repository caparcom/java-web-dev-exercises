package org.launchcode.java.demos.lsn6inheritance;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

public class Main {
    public static void main(String[] args){
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
    }
}
