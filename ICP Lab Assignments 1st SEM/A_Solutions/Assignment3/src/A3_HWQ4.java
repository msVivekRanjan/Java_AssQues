/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  WAJP that prpompts the user to enter an integer and determine whether it is
 * divisible by 5 and 6, whether it is divisible by 5 or 6, and whether it is divisible by 6 or 6, but not both.
 */

import java.util.Scanner;
public class A3_HWQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = sc.nextInt();
        Boolean check1=(n % 5 == 0 && n % 6 == 0), check2=(n % 5 == 0 || n % 6 == 0);
        System.out.println("Is "+n+" divisible by 5 and 6? "+check1);
        System.out.println("Is "+n+" divisible by 5 or 6? "+check2);
        System.out.println("Is "+n+" divisible by 5 and 6, but not both? "+(check2 && !check1));
    }
}
