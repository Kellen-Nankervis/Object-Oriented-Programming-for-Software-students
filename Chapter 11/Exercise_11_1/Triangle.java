/*
Author: Kellen Nankervis
Date: 8/17/2021

This is the Triangle class. It makes the Triangle object and it's methods.

*/

package com.company;

public class Triangle
extends SimpleGeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    Triangle(double firstSide, double secondSide, double thirdSide) {
        side1 = firstSide;
        side2 = secondSide;
        side3 = thirdSide;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle:\nside1 = " + side1 + "\nside2 = " + side2 +
                "\nside3 = " + side3;
    }
}