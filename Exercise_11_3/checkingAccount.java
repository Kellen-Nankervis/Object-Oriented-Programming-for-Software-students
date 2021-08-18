/*
Author: Kellen Nankervis
Date: 8/17/2021

This is the checkingAccount class. It makes the checkingAccount object and it's methods.

*/

package com.company;

public class checkingAccount
extends Account {
    private double overDraftLimit;

    public checkingAccount() {
        super();
        overDraftLimit = 50;
    }

    public checkingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overDraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overDraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overDraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount < (overDraftLimit * -1)) {
            System.out.println("The amount you are trying to withdraw exceeds the over draft limit.");
        }
        else
            setBalance(getBalance() - amount);
    }

    public String toString() {
        return super.toString() + "\nOverdraft limit: $" +
                String.format("%.2f", overDraftLimit);
    }
}