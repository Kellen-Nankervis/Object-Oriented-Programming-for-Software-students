/*
Author: Kellen Nankervis
Date: 8/17/2021

This is the savingsAccount class. It makes the savingsAccount object and it's methods.

*/

package com.company;

public class savingsAccount
extends Account {
    public savingsAccount() {
        super();
    }

    public savingsAccount(int id, double balance) {
        super(id, balance);
    }

    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("Savings accounts cannot be overdrawn, transaction rejected.");
        }
        else
            setBalance(getBalance() - amount);
    }
}