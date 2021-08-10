/*
Author: Kellen Nankervis
Date: 8/4/2021

This is the Account class. It makes the Account object and it's methods.

*/

package com.KellenNankervis;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
        return id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public String getDateCreated(){
        return dateCreated.toString();
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * ((annualInterestRate / 12) / 100);
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}