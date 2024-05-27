package com.husensei;

import java.util.Scanner;

public class NumberOperations {
    public static int additionNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        int result = additionNumber(num1, num2);

        System.out.println("Result " + result);

        scanner.close();
    }
}