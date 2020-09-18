package com.CollegeProjects;
//4th program

import java.util.Scanner; // Importing Scanner class so that i can make an obj of its type

class Student {
    String name = null;
    int total;
    byte m1, m2, m3, m4; // Range of byte datatype -128 to 127
    float percentage;

    void setData() {
        Scanner sc = new Scanner(System.in); // Creating Scanner class obj to take input from keyboard
        System.out.print("Input the Student's Name: ");
        name = sc.next(); // Taking input using sc object of Scanner class

        System.out.print("Input marks for subject-1: ");
        m1 = sc.nextByte();
        System.out.print("Input marks for subject-2: ");
        m2 = sc.nextByte();
        System.out.print("Input marks for subject-3: ");
        m3 = sc.nextByte();
        System.out.print("Input marks for subject-4: ");
        m4 = sc.nextByte();
    }


    void getData() {
        total = m1 + m2 + m3 + m4;
        percentage = ((float) total / 400.0f) * 100.0f; // Here i am using typecasting as i need result to be in a floating point number
        System.out.println("Result of " + name + " is here:-");
        System.out.println("Total marks obtained by " + name + " are: " + total + " out of 400");
        System.out.println(name + " got " + percentage + "%");
    }
}

public class MarkSheet {
    public static void main(String[] args) {

        Student entity = new Student(); // Creating an object of class Student
        entity.setData();
        entity.getData();

    }
}

