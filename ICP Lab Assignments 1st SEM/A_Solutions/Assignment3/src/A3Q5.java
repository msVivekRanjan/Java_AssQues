/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a Java program that takes a year from user and print true if that year is a leap year
otherwise print false.
 */

import java.util.*;

public class A3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = sc.nextInt();
        System.out.printf("%d is a leap year: ",year);
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) System.out.println(true);
        else System.out.println(false);
    }
}
