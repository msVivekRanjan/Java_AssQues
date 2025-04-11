/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a program that generates a random integer number between 1 to 10 and asks the user to
guess what the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random number, the
program should display "Too low, try again." The program should use a loop that repeats until
the user correctly guesses the random number and display good guess.
 */


import java.util.Random;
import java.util.Scanner;
public class A4Q8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();
        int b=ran.nextInt(9) + 1;
        while(true){
            System.out.println("Your guess: ");
            int a=sc.nextInt();
            
            if(a>b) System.out.println("Too high, try again");
            else if(a<b) System.out.println("Too low, try again");
            else if(a==b){
                System.out.println("Good guess!");
                break;
            }
        }
    }
}
