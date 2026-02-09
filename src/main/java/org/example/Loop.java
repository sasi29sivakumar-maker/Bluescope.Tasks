package org.example;
import java.util.Scanner;

    public class Loop {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number ");
            int n=sc.nextInt();
            System.out.println("enter a number ");
            int m=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                System.out.println(i);
            }

            while(m<25)
            {
                System.out.println(m);
                m+=1;
            }
        }
    }

