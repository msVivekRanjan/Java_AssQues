/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to print the multiplication table of a number entered by the user.
 */


import java.util.Scanner;
public class A4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no. for which you want to find the multiplication table: ");
        int n = sc.nextInt();
        System.out.println("The multiplicaiton table of 8 is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
