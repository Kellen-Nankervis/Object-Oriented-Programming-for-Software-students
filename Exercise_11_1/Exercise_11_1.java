/*
Author: Kellen Nankervis
Date: 8/17/2021

This is a class that tests the SimpleGeometricObject and Triangle class.

*/

package com.company;

import java.util.Scanner;

public class Exercise_11_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first side of the triangle: ");
        double side1 = input.nextDouble();

        System.out.println("Please enter the second side of the triangle: ");
        double side2 = input.nextDouble();

        System.out.println("Please enter the third side of the triangle: ");
        double side3 = input.nextDouble();

        System.out.println("Please enter a color: ");
        String color = input.next();

        System.out.println("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        displayTriangle(triangle);
    }

    public static void displayTriangle(Triangle triangle){
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is filled? " + (triangle.isFilled() ? "True" : "False"));
    }
}
