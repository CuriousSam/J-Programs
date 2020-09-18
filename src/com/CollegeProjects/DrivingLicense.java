package com.CollegeProjects;

import java.util.Scanner;

//5th program
class Criteria {
    int age;

    void isEligible() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        age = sc.nextInt();

        if (age >= 18 && age <= 120) {
            System.out.println("You can apply for Driving License");
        } else if (age <= 0 || age > 120) {
            System.out.println("Invalid age!!");
        } else
            System.out.println("You are too young to drive!");

    }
}

public class DrivingLicense {
    public static void main(String[] args) {
        Criteria obj = new Criteria();
        obj.isEligible();
    }
}

