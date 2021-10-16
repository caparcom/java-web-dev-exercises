package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){

        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator flavorComparator = new FlavorComparator();
        Comparator coneComparator = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(flavorComparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(coneComparator);


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("Welcome to our ice cream shop! Please select a flavor and a cone!\n");
        System.out.println("FLAVORS: \n");
        for (Flavor item: flavors){
            System.out.println(item);
        }
        System.out.println("CONES: \n");
        for (Cone item: cones){
            System.out.println(item);
        }

    }
}
