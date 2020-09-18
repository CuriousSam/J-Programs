package com.CollegeProjects;

import java.util.Scanner;

//3rd program
class CylinderVOl {

    final float PI = 3.14159f;
    float radius, height, volume;

    void setData(float r, float h) {
        radius = r;
        height = h;
    }

    float calcVolume() {
        volume = PI * radius * radius * height;
        return volume;
    }

}

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CylinderVOl aCylinder = new CylinderVOl();
        System.out.println("Input radius of cylinder");
        float r = sc.nextFloat();
        System.out.println("Input height of cylinder");
        float h = sc.nextFloat();

        aCylinder.setData(r, h);
        System.out.println("The volume of cylinder having radius: " + aCylinder.radius + " height: " + aCylinder.height
                + " is: " + aCylinder.calcVolume());
    }
}
