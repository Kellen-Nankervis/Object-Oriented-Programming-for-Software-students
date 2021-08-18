/*
Author: Kellen Nankervis
Date: 8/18/2021

This program creates a file then it prints a bunch of random numbers to it. Afterwards reads from the file and then sorts the numbers from least to greatest.

*/

package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Exercise_12_15 {
    public static void main(String[] args) throws Exception {
        int breakProgram = 0;
        while(breakProgram == 0) {
            File file = new File("C:\\Users\\grave\\Desktop\\Test\\Exercise12_15.txt");
            if (file.exists()) {
                System.out.println("The file you are trying to create already exists, it will be overwritten.");
                breakProgram++;
            }
            try(
                PrintWriter bw = new PrintWriter(file)){
                for(int i = 0; i < 100; i++){
                    bw.print(((int)(Math.random()*10000)+1));
                    bw.print("\n");
                }
            }

            int[] array = new int[100];

            try{
                BufferedReader br = new BufferedReader(
                        new FileReader("C:\\Users\\grave\\Desktop\\Test\\Exercise12_15.txt"));
                for(int n = 0; n < 100; n++){
                    String qr = br.readLine();
                    array[n] = Integer.parseInt(qr);
                }
            }catch(Exception ex){
                System.out.println("Error Code 2");
                breakProgram++;
            }
            Arrays.sort(array);
            for(int l = 0; l < 100; l++){
                System.out.println(array[l]);
            }
            breakProgram++;
        }
    }
}