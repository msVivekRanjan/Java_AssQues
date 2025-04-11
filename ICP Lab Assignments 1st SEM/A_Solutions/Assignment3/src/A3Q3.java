/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a program that reads three integers from the user and prints "Increasing" if the
numbers are in increasing order, "Decreasing" if the numbers are in decreasing order,
and "Neither increasing nor decreasing order" otherwise.
 */

 import java.util.Scanner;

public class A3Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && b>c) System.out.println("\"Increasing\"");
        else if (c>b && b>a) System.out.println("\"Decreasing\"");
        else System.out.println("\"Neither increasing nor descreasing\" ");
    }
}
