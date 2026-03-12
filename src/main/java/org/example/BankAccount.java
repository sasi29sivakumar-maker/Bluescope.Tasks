package org.example;
public class BankAccount {

    public static void main(String[] args) {

        int balance = 600;
        int withdraw = 200;

        if(balance - withdraw >= 500){
            balance = balance - withdraw;
            System.out.println("Withdraw success");
        }else{
            System.out.println("Minimum balance should be 500");
        }

        System.out.println("Balance: " + balance);
    }
}