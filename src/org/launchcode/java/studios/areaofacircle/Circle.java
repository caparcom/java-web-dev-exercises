package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Circle {

    private double PI = 3.1415926;
    private double userRadius;
    private double areaOfUserCircle;

    public Circle(Double userRadius) {
        this.userRadius = userRadius;
    }

    public Circle() {

    }

    public double getUserRadius() {
        return userRadius;
    }

    public double setUserRadius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle");
        this.userRadius = input.nextDouble();
        input.close();
        return this.userRadius;
    }

    public double getAreaOfUserCircle() {
        return areaOfUserCircle;
    }

    public void setAreaOfUserCircle(double areaOfUserCircle) {
        this.areaOfUserCircle = areaOfUserCircle;
    }


    public double getArea(double userRadius){
        return PI * (userRadius * userRadius);
    };


}
