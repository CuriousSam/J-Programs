package com.CollegeProjects;

//1st program
class CircArea {
    float radius, area;
    final float PI = 3.14159f;

    void calcArea(float r) {
        radius = r;
        area = PI * radius * radius;
        System.out.println("The area of circle having radius: " + radius + " is: " + area);
    }

}

public class AreaOfCircle {
    public static void main(String[] args) {

        CircArea circle = new CircArea();

        circle.calcArea(6.4f);

    }
}
