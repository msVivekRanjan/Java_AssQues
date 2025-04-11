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
public class A4Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n=sc.nextInt();
        int no=0,mul=1;
        while (n>0){
            int m=n%10;
            if(m!=0){
                no=m*mul+no;
                mul*=10;
            }
        
            n=n/10;
        }
        System.out.println("After removing 0 from number 10203040,  the new number is "+no);
    }
}
