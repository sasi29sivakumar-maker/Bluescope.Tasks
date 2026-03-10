package org.example;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;   // initial balance

        System.out.println("Enter deposit amount:");
        double deposit = sc.nextDouble();

        balance = balance + deposit;

        System.out.println("Enter withdraw amount:");
        double withdraw = sc.nextDouble();

        if(withdraw <= balance){
            balance = balance - withdraw;
            System.out.println("Transaction success");
        }else{
            System.out.println("Insufficient balance");
        }

        System.out.println("Final balance: " + balance);
    }
}