package com.rahul_practice;

import java.util.Scanner;
public class makeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // if user will tap the X and x then the calculator will terminate;
        int ans=0;
        while (true) {
            System.out.print("Enter the operator :  ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //input two numbers
                System.out.print("Enter num1: ");
                int num1 = in.nextInt();
                System.out.print("Enter num2: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            }else if (op=='x' || op=='X'){
                break;
            }else {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }

    }
}