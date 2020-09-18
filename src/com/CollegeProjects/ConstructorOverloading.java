package com.CollegeProjects;

//12th program
class CalculateArea {

    CalculateArea(int a) {
        System.out.println("The area of Square is: " + a * a);
    }

    CalculateArea(float l, float w) {
        System.out.println("The area of Rectangle is: " + l * w);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {

        int side = 7;
        float length = 2.985f, width = 5.68f;

        CalculateArea square = new CalculateArea(side);
        CalculateArea rect = new CalculateArea(length, width);
    }
}
