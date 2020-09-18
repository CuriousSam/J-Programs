package com.CollegeProjects;

import java.util.Scanner;
//9th program

public class ForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows");
        byte rows = sc.nextByte();
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}

