package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area{
    public static void main (String[] args){

        Circle newCircle = new Circle();
        double userRadi = newCircle.setUserRadius();

        if (userRadi <= 0){
            System.out.println("Please input a positive Integer");
        } else {
            System.out.println("A circle with a radius of " + userRadi + ", will have an area of " + newCircle.getArea(userRadi));
        }


    }

}
