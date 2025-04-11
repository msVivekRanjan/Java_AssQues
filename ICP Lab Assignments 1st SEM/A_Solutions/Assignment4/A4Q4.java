/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's
algorithm, which is an iterative computation based on the following observation: if y divides
x, the GCD of x and y is y; otherwise, the GCD of x and y is same as GCD of x % y and y.
 */


import java.util.Scanner;
public class A4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        int x = sc.nextInt(); 
        
        System.out.print("Enter the second number (y): ");
        int y = sc.nextInt();

        System.out.printf("The GCD of %d and %d is ",x,y);
        while (y != 0) {
            x %= y;
            int temp = x;
            x = y;
            y = temp;
        }
        System.out.print(x);
    }
}
