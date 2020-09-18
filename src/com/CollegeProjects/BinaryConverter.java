package com.CollegeProjects;

import java.util.Scanner;// Importing Scanner class so that i can make an obj of its type

// 7th program
class DecimalToBinaryConverter {
    int decimal, binary = 0;
    int rem, position = 1;

    int calculateBinary(int num) {
        decimal = num;
        // Logic for Binary conversion
        while (decimal != 0) {
            rem = decimal % 2;
            binary = binary + (rem * position);
            position = position * 10;
            decimal = decimal / 2;
        }
        return binary;
    }
}

public class BinaryConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Creating Scanner class obj to take input from keyboard
        DecimalToBinaryConverter myObj = new DecimalToBinaryConverter(); // Creating an object of class DecimalToBinaryConverter

        System.out.println("Input a Decimal number: ");
        int num = sc.nextInt();// Taking input using sc object of Scanner class

        System.out.println("The Binary equivalent of " + num + " is:  " + myObj.calculateBinary(num));

    }
}

