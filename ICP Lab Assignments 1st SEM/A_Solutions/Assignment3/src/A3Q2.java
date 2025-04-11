/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Alice visited SUM hospital to get treatment for her fever and illness. Doctor advised
her to drink at least 5000 ml of water each day. Alice drank x ml of water today. Write
a program that print the following message depending on the value of x.
 */

import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter amount of litres you drank (x): ");
        int x=sc.nextInt();
        if(x>=5000) System.out.println("Yes, Alice is following doctor's advice");
        else System.out.println("No, Alice is not following doctor's advice");
        
    }
}
