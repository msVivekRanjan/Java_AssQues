package Assignment2;

/*
 * Author's Name : Vivek Ranjan Sahoo
 * Regt No.      : 24E119B46
 * Section       : 24E1D2
 * Subject       : CSE Core(CS001)
 * Problem Description       : 
 */

import java.util.Scanner; 
public class Q2 {   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no of eggs: ");
        int n = sc.nextInt();
        int gross=(int) n/144;
        int rem=n%144;
        int doz=(int) rem/12;
        int left =doz%12;
        System.out.printf("%d gross, %d dozens, %d left over eggs",gross,doz,left);
    }
}
