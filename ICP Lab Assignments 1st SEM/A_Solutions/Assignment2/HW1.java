package Assignment2;
/*
 * Author's Name : Vivek Ranjan Sahoo
 * Regt No.      : 24E119B46
 * Section       : 24E1D2
 * Subject       : CSE Core(CS001)
 * Problem Description       : Convert minutes to years and days
 */

 import java.util.Scanner;  
 public class HW1 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the minutes: ");
         float min= sc.nextInt();
         float yr=min/(60*24*365);
         float rem=min%(60*24*365);
         float day=(rem/(24*60));
         System.out.printf("%d Years and %d Days",(int)yr,(int)day);
 
     }
 }
 
