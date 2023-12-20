package com.linecomparison;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ComparisonComputation {
    public static void main(String[] args) {
        System.out.println("Enter (x1,y1) and (x2,y2)");
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double lineLength = sqrt(pow((x2-x1),2) + pow((y2-y1),2));
        System.out.println("The Length of a Line = "+lineLength);
    }
}
