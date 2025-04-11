/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  WAJP that randomly genrates an integer between 1 and 12 and displays the English month name
 * January, February... December for the number 1,2... 12, accordingly.
 */

import java.util.Scanner;
public class A3_HWQ3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=(int)(Math.random()*12)+1;
        String month[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(month[n-1]);
    }
}
