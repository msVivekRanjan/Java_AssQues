/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to print largest power of three less than or equal to N.
 */


import java.util.Scanner;
public class A4Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int i = 1;
        while(i*3<n){
            i = i*3;
        }
        System.out.printf("The largest power of 3 less than or equal to %d is %d",n,i);
    }
}
