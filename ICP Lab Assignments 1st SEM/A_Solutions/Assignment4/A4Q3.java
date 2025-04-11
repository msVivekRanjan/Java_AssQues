/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program that takes an integer N from user, uses
Math. Random () to print N random integer numbers between 1 to N, and then prints their
average value. Use do while loop.
 */


import java.util.Scanner;
public class A4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i=0,avg=0,n=sc.nextInt();
        do{
            int x=(int)(Math.random()*n)+1;
            System.out.print(x+"  ");
            avg+=x;
            i++;
        }while(i<n);
        System.out.printf("\nAverage of %d random numbers are %d",n,avg);
    }
}
