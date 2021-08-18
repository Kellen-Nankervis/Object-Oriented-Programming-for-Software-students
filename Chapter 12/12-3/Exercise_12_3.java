/*
Author: Kellen Nankervis
Date: 8/18/2021

This program creates an array of 100 random numbers and then asks the user to enter an index for the array. If the index is valid the program prints the corresponding integer, otherwise it tells the user "Out of Bounds.".

*/

package com.company;

import java.util.Scanner;

public class Exercise_12_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = (int)(Math.random()*10000) + 1;
        }

        int test = 0;
        while(test == 0) {
            System.out.println("Please enter an index for the array: ");
            int index = input.nextInt();
            if(index > 100){
                System.out.println("Out of Bounds.");
            } else{
                System.out.println("The corresponding element value to the index you entered is: "
                + array[(index-1)]);
                test++;
            }
        }
    }
}