package org.example;

import java.util.Scanner;

public class Pallindrome {

        public static boolean isPalindrome(int num) {
            int original = num;
            int reverse = 0;
            while (num > 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;
            }
            return original == reverse;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter starting number: ");
            int start = sc.nextInt();
            System.out.print("Enter ending number: ");
            int end = sc.nextInt();
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (isPalindrome(i)) {
                    sum += i;
                }
            }
            System.out.println("Sum of palindromic numbers = " + sum);
        }
    }





