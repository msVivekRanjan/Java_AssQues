/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
program to determine whether or not the number is divisible by 9. Test it on the following
numbers: Use while loop.
 */


import java.util.Scanner;
public class A4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%9==0) System.out.println("Divisible by 9");
        else System.out.println("Not Divisible by 9");
    }
}
