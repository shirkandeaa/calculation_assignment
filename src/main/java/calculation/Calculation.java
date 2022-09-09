package main.java.calculation;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Iteration objiteration = new Iteration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter value for A");
        int A = sc.nextInt();
        System.out.println("Please enter value for X");
        int X = sc.nextInt();
        objiteration.multiple_iteration(A, X);
    }
}
