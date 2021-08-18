/*
Author: Kellen Nankervis
Date: 8/17/2021

This program tests the Account, savingsAccount, and checkingAccount objects.

*/

package com.company;

public class Exercise_11_3 {

    public static void main(String[] args) {
        Account accountOne  = new Account(6200, 25000);
        savingsAccount savingsOne = new savingsAccount(8163, 25000);
        checkingAccount checkingOne = new checkingAccount(7492, 25000,50);

        System.out.println(accountOne.toString());
        System.out.println(savingsOne.toString());
        System.out.println(checkingOne.toString());
    }
}