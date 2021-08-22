package com.company;

import java.util.Scanner;

public class Exercise_13_11 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the side length of the octagon you would like to create: ");
        double sideLength = input.nextDouble();

        Octagon firstOctagon = new Octagon(sideLength);

        System.out.println("The Area of the first octagon: " + firstOctagon.getArea());
        System.out.println("The Perimeter of the first octagon " + firstOctagon.getPerimeter());

        System.out.println("The first octagon will now be cloned to create the second octagon.");
        Octagon secondOctagon = (Octagon)firstOctagon.clone();

        System.out.println("Before comparing the two octagons, the area and perimeter of the second octagon will be printed.");

        System.out.println("The Area of the second octagon: " + secondOctagon.getArea());
        System.out.println("The Perimeter of the second octagon " + secondOctagon.getPerimeter());

        System.out.println("The first octagon and the second octagon will now be compared.");
        int comparason = (firstOctagon.compareTo(secondOctagon));
        if(comparason == 1 || comparason == -1){
            System.out.println("The first Octagon is different from it's clone");
        }else{
            System.out.println("The first Octagon is the same as it's clone.");
        }
    }
}
