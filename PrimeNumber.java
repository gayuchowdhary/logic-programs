package com.bridgelabz.logicprograms;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= (n / 2); i++) {
            if ((n % i) == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The number" + " " + n + " " + "is prime number");
        }
        else {
            System.out.println("The number" + " " + n + " " + "is not prime number");
        }
    }
}


