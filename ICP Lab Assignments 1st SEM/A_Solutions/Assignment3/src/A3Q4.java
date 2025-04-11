/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Make a simple game involving a computer and a user. The computer first guesses a
number between 1 and 9 inclusive, then ask the user to enter a number between 1 and
9 inclusive. If the user guess is correct then display “You got it right”, if the guess is
close (+1, -1) “Almost got it “, Otherwise “You got it wrong”.
 */

import java.util.*;

public class A3Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many times you want to play?");
        Random r=new Random();
        int x=sc.nextInt();
        
        for(int i=0;i<x;i++){
            System.out.print("Enter user number: ");
            int a=sc.nextInt();
            int b=r.nextInt(9) + 1;
            System.out.println("Computer guesses: "+b);
            if(a==b) System.out.println("\"You got it correct.\"\n");
            if(a++==b || a--==b) System.out.println("\"Almost got it.\"\n");
            else System.out.println("\"You got it wrong.\"\n");
        }
    }
}
