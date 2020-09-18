package com.CollegeProjects;

import java.util.Scanner;

//8th program
public class DoWhileLoop {
    public static void main(String[] args) {
        float var1 = 0.f, var2;
        byte count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Input a number: ");
            var2 = sc.nextFloat();
            var1 += var2;
            count++;
        }
        while (var2 != 0);
        System.out.println("The sum is: " + var1);
        System.out.println("Number of times Do-While loop was executed: " + count);
    }
}

