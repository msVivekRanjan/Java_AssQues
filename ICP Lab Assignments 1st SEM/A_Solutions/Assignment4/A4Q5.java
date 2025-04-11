/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a Java program to check if a number is perfect number or not.
(Hints: A number N is called perfect number, if the sum of factors except N as a factor is
equals to the number N)
 */


import java.util.Scanner;
public class A4Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum+=i;
        }
        if (sum==n) System.out.printf("%d is a perfect number.",n);
        else System.out.printf("%d is not a perfect number.",n);
    }
}
