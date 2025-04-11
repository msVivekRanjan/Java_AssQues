/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  WAJP that plays the popular sciccor-rock paper game by randomly generating
 * a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts the user to enter a
 * number 0, 1, or 2 and displays a message indicating whether the user wins, loses, or draws.
 */

import java.util.Scanner;
public class A3_HWQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String [] choices = {"scissor", "rock", "paper"};
        char ask;
        do{
            System.out.print("scissor (0), rock (1), paper (2): ");
            int user = sc.nextInt();
            int comp = (int)(Math.random()*3);
            try{
                System.out.printf("The computer is %s. You are %s",choices[comp],choices[user]);
                if(user==comp) System.out.println(" too. It's a draw!");
                else{
                    switch(user){
                        case 0 -> {
                            if(comp==2) System.out.print(". You won!\n");
                            else if(comp==1) System.out.print(". You lose!\n");
                        }
                        case 1 -> {
                            if(comp==0) System.out.print(". You won!\n");
                            else if(comp==2) System.out.print(". You lose!\n");
                        }
                        case 2 -> {
                            if(comp==1) System.out.print(". You won!\n");
                            else if(comp==0) System.out.print(". You lose!\n");
                        }
                    }
                }
            }
            catch (Exception e){
                System.out.println("Invalid input.");
            }
            System.out.println("Play again? (y/n): ");
            ask = sc.next().charAt(0);
        }while(ask=='y');
    }
}
