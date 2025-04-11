/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program that gets three integer numbers from the user. Count from the first number
to the second number increments by the third number. Use for loop to do it. Also, display the
sum of numbers displayed between the first number and second number.
 */

import java.util.Scanner;
public class A4Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Enter third number: ");
        int c=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i+=c){
            System.out.print(i+" ");
        }
        System.out.println("\nThe sum of the number displayed is "+sum);
    }
}
