package org.example;

public class Loan {
    public static void main(String[] args) {

        int salary = 30000;
        int age = 35;

        String result = (salary > 25000 && age < 60) ?
                "Loan Approved" :
                "Loan Rejected";

        System.out.println(result);
    }
}