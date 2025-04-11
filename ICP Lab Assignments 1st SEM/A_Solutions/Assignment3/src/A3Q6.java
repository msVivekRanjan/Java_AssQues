/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to calculate the monthly electricity bill. The tariff is given as
follows:

Price per unit      Unit range
Rs. 3/-             First 50 units
Rs. 4.80/-          50-200 units
Rs. 5.80/-          200-400 units
Rs. 6.20/-          Above 400 units
 */

import java.util.Scanner;
public class A3Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double cost=0;
        if (units<=50){
            cost = units*3;
        } else if (units <= 200){
            cost = (50*3) + (units-50)*4.8;
        } else if (units <= 400){
            cost = (50*3) + (150*4.8) + ((units-200)*5.8);
        } else {
            cost = (50*3) + (150*4.8) + (200*5.8) + ((units-400)*6.2);
        }
        System.out.printf("Total electric bill is : Rs. %.2f/-",cost);
    } 
}
