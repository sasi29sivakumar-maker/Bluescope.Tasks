package org.example;

public class SecondLargestSum {

        public static void main(String[] args) {
            int[] numbers = {15, 23, 8, 42, 42, 31};

            int secondLargest = findSecondLargest(numbers);

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest number found.");
            } else {
                int digitSum = calculateDigitSum(secondLargest);
                System.out.println("Second Largest Number: " + secondLargest);
                System.out.println("Sum of its Digits: " + digitSum);
            }
        }

        // Finds the second largest distinct value in O(n)
        static int findSecondLargest(int[] arr) {
            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }
            return second;
        }

        // Calculates sum of digits using % and 
        static int calculateDigitSum(int num) {
            int sum = 0;
            num = Math.abs(num); 
            while (num > 0) {
                sum += num % 10;  
                num /= 10;        
            }
            return sum;
        }
    }


