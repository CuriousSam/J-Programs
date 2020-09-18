package com.CollegeProjects;

//2nd program
class RectArea {

    float length, width, area;

    void setData(float l, float w) {
        length = l;
        width = w;
    }

    float calcArea() {
        area = length * width;
        return area;
    }
}

public class AreaOfRectangle {
    public static void main(String[] args) {
        RectArea myObj = new RectArea();
        myObj.setData(2.96f, 6.25f);
        System.out.println("The area of rectangle having width: " + myObj.width + " and length: " + myObj.length
                + " is: " + myObj.calcArea());

    }
}