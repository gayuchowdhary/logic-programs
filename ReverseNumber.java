package com.bridgelabz.logicprograms;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number");
        int num = sc.nextInt();
        int reminder = 0;
        int reverseNumber = 0;
        while(num != 0) {
            reminder = num % 10;
            reverseNumber = (reverseNumber * 10) + reminder;
            num = num / 10;
        }
        System.out.println("The reversed number is" + " " + reverseNumber);
    }
}
