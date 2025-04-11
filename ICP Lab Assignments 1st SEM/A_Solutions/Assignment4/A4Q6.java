/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to enter two numbers through the keyboard. Write a program to find the
value of one number raised to the power of another. (Do not use Java built-in method).
 */


import java.util.Scanner;
public class A4Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b=sc.nextInt();
        int ans=1;
        for(int i=0;i<b;i++) ans*=a;
        System.out.printf("%d to the power %d is: %d",a,b,ans);
    }
}
