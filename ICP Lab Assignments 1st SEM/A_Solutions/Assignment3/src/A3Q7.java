/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  From the previous question no. (6) write a java program
 * with a choice if the consumer wants to pay bill online. Consumer who pays their 
 * electricity bill online will get a discount of 3%.

Price per unit      Unit range
Rs. 3/-             First 50 units
Rs. 4.80/-          50-200 units
Rs. 5.80/-          200-400 units
Rs. 6.20/-          Above 400 units
 */

import java.util.Scanner;
public class A3Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("No. of units consumed: ");
        int units = sc.nextInt();
        double cost=0;
        if (units<=50){
            cost = units*3;
        } else if (units <= 200){
            cost = ((50*3) + (units-50)*4.8);
        } else if (units <= 400){
            cost = ((50*3) + (150*4.8) + ((units-200)*5.8));
        } else {
            cost = ((50*3) + (150*4.8) + (200*5.8) + ((units-400)*6.2));
        }
        System.out.println("Do you want to pay online (y/n): ");
        char ask = sc.next().charAt(0);
        System.out.println("Total amount: "+cost);
        if(ask=='y') {
            double d=0.03*cost, amt=cost-d;
            System.out.printf("Discount: %.2f\n",d);
            System.out.println("Amount payable: "+amt);
        }
    }
}
