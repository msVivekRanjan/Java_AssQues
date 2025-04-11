/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  WAJP that prompts the user to enter an integer for today's day of the week
 * (Sunday is 0, Monday is 1... and Saturday is 6). Also prompt the user to enter the number of days
 * after today for a future day and dislay the future day of the week.
 */

import java.util.Scanner;
public class A3_HWQ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today=sc.nextInt();
        System.out.print("Enter number of days after today: ");
        int days=sc.nextInt();
        String week[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int futureday = (int)(today+days)%7;
        System.out.printf("Today is %s and the future day is %s",week[today],week[futureday]);
    }
}
