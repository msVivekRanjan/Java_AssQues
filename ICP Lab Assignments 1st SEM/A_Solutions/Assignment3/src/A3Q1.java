/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a program to input the age of a person and check if the age of the person is
greater than or equal to 18 then print the message: “You are eligible to cast your vote”.
 */

import java.util.*;
public class A3Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int n=sc.nextInt();
        if(n>=19) System.out.println("Eligible for vote.");
        
    }
}
