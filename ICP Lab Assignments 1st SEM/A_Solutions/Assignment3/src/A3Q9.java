/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a program to input 3 integer number a, b, c. Find the largest number among 3.
Also find the 2nd largest number among 3.
 */

import java.util.Scanner;
public class A3Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a, b, c: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int high = Math.max(c,Math.max(a,b));
        int high2 = (a == high) ? Math.max(b, c) : (b == high) ? Math.max(a, c) : Math.max(a, b);
        System.out.println("Largest number: "+high);
        System.out.println("2nd largest number: "+high2);

    }
}
