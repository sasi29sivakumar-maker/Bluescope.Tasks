package org.example;

import java.util.Scanner;

public class ArmStrongSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int digits = 0;
        int sum = 0;


        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }


        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println("Armstrong sum = " + sum);


        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}

