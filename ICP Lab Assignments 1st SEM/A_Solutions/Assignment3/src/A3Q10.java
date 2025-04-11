/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  A University conducts a 100-mark exam for its student and grades them as follows.
Assigns a grade based on the value of the marks. Write a java program to print the
grade according to the mark secured by the student. [Use switch-case].
 */


import java.util.Scanner;
public class A3Q10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int n = sc.nextInt();
        n=(int) n/10;
        char grade;
        switch(n){
            case 10 : grade = 'O'; break;
            case 9 : grade = 'O'; break;
            case 8 : grade = 'A'; break;
            case 7 : grade = 'B'; break;
            case 6 : grade = 'C'; break;
            case 5 : grade = 'D'; break;
            case 4 : grade = 'E'; break;
            default : grade = 'F';
        }
        System.out.println("Your grade : "+grade);
    }
}
