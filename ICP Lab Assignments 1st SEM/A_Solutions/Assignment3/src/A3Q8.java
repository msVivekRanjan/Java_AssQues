/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program that takes the x – y coordinates of a point in the Cartesian plane
and prints a message telling either an axis on which the point lies or the quadrant in
which it is found.
 */

import java.util.Scanner;

public class A3Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x-coordinate: ");
        double x = sc.nextDouble();
        System.out.println("Enter y-coordinate: ");
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.printf("(%.1f, %.1f) is on the origin", x, y);
        } else if (x == 0) {
            System.out.printf("(%.1f, %.1f) is on the y-axis", x, y);
        } else if (y == 0) {
            System.out.printf("(%.1f, %.1f) is on the x-axis", x, y);
        } else {
            if (x > 0) {
                if (y > 0) {
                    System.out.printf("(%.1f, %.1f) is in quadrant I", x, y);
                } else {
                    System.out.printf("(%.1f, %.1f) is in quadrant IV", x, y);
                }
            } else {
                if (y < 0) {
                    System.out.printf("(%.1f, %.1f) is in quadrant III", x, y);
                } else {
                    System.out.printf("(%.1f, %.1f) is in quadrant II", x, y);
                }
            }
        }
    }
}