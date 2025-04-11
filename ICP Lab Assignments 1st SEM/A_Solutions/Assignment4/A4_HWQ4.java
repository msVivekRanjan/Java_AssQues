/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to print the sum of all even numbers and the product of all
 * odd numbers from 1 to N, where N is the input to the program.
 */

import java.util.Scanner;
public class A4_HWQ4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("For input, N = ");
        int n=sc.nextInt();
        int sum=0,pdt=1;
        for(int i=1;i<=n;i++){
            if(i%2==0)sum+=i;
            else pdt*=i;
        }
        System.out.printf("Sum of all even numbers = %d\nProduct of all odd numbers = %d",sum,pdt);
    }
}
