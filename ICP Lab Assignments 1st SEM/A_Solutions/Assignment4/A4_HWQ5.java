/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to print the following output usnig loop. Where, input is the number
 * of rows in output pattern
 * 1
 * 121
 * 12321
 * 12321412321
 */

import java.util.Scanner;
public class A4_HWQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("For input,N = ");
        int n = sc.nextInt();
        String p="";
        for(int i=1;i<=n;i++){
            p=p+i+p;
            System.out.println(p);
        }
    }
}
