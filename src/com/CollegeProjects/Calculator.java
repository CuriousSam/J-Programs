package com.CollegeProjects;

import java.util.Scanner;

//6th program
class ArithmeticCalc {
    float op1, op2, res;
    char ch;

    void calcResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your first operand");
        op1 = sc.nextFloat();
        System.out.println("Select Operator {either +, -, /, or *}");
        ch = sc.next().charAt(0);
        System.out.println("Input second operand");
        op2 = sc.nextFloat();

        switch (ch) {
            case '+':
                res = op1 + op2;
                System.out.println("The result is: " + res);
                break;
            case '-':
                res = op1 - op2;
                System.out.println("The result is: " + res);
                break;
            case '/':
                res = op1 / op2;
                System.out.println("The result is: " + res);
                break;
            case '*':
                res = op1 * op2;
                System.out.println("The result is: " + res);
                break;
            default:
                System.out.println("Invalid Operator!");
        }
    }

}

public class Calculator {
    public static void main(String[] args) {
        ArithmeticCalc obj = new ArithmeticCalc();
        obj.calcResult();
    }
}

