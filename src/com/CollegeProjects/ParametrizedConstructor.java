package com.CollegeProjects;

import java.util.Scanner;

//11th program
class Greatest {
    int a, b, c;

    Greatest(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    int calcGreatest() {
        if (a >= b && a >= c)
            return a;

        else if (b >= a && b >= c)
            return b;

        else
            return c;
    }
}

public class ParametrizedConstructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 3 integers to find the largest");
        int var1 = sc.nextInt();
        int var2 = sc.nextInt();
        int var3 = sc.nextInt();

        Greatest obj = new Greatest(var1, var2, var3); // This is parameterized constructor as i am passing some args.

        System.out.println("The largest is: " + obj.calcGreatest());
    }
}

