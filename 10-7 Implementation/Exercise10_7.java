/*
Author: Kellen Nankervis
Date: 8/9/2021

This program calls the Account.java class and builds 10 of the Account object. Then it forms accounts with id's of 0-9 and gives them a balance of $100.
Then the user may pull up the account with the id and look at the current balance, withdraw funds, or deposit funds.

*/

package com.KellenNankervis;

import java.util.Scanner;

class Exercise10_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account[] accounts = new Account[10];

        for(int i = 0; i < accounts.length; i++){
            accounts[i] = new Account(i,100);
        }

        do {
            System.out.println("\n\nEnter an ID: ");
            int id = input.nextInt();

            if(validID(id,accounts)) {
                int userMenuInput;
                do {
                    System.out.println("\nMain Menu\n1:check balance\n2:withdraw\n3:deposit\n4:exit");
                    userMenuInput = input.nextInt();
                   if(userMenuInput > 0 && userMenuInput < 4){
                       userChoice(accounts, id, input, userMenuInput);
                   }
                } while (userMenuInput != 4);
            }
        } while(true);
    }

    public static boolean validID(int id, Account[] accounts){
        for (Account account : accounts) {
            if (id == account.getID()) {
                return true;
            }
        }
        return false;
    }

    public static void userChoice(Account[] accounts, int id, Scanner input, int umi){
        switch (umi){
            case 1:
                System.out.println("The balance is "+ accounts[id].getBalance());
                break;
            case 2:
                System.out.println("Enter amount to withdraw: ");
                accounts[id].withdraw(input.nextDouble());
                break;
            case 3:
                System.out.println("Enter an amount to deposit: ");
                accounts[id].deposit(input.nextDouble());
        }
    }
}