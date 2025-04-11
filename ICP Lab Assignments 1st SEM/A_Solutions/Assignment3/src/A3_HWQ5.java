/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Semester   :  1st
 * Author's Branch-Sec :  CSE (24E1D2)
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program which displays an appropriate name for a person, using a
combination of nested ifs and compound conditions. Ask the user for a gender, first
name, last name and age. If the person is female and 20 or over, ask if she is married.
If so, display "Mrs." in front of her name. If not, display "Ms." in front of her name. If
the female is under 20, display her first and last name. If the person is male and 20 or
over, display "Mr." in front of his name. Otherwise, display his first and last name. Note
that asking a person if they are married should only be done if they are female and 20
or older, which means you will have a single if and else nested inside one of your if
statements.
 */

import java.util.Scanner;
public class A3_HWQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cont;
        do{
            System.out.print("Enter your gender (M/F):");
            char gender = sc.next().toUpperCase().charAt(0);
            System.out.print("Enter your first name:");
            String firstName = sc.next();
            System.out.print("Enter your last name:");
            String lastName = sc.next();
            System.out.print("Enter your age:");
            short age = sc.nextShort();
            String name =firstName;
            if (gender=='F'){
                if (age >= 20){
                    System.out.printf("Are you married, %s (y/n)? ",firstName);
                    char married = sc.next().toLowerCase().charAt(0);
                    if (married == 'y') name="Mrs. "+name+" "+lastName;
                    else name = "Ms. "+name;
                }
                else name = "Ms. "+name;
            }
            else{
                if (age >= 20) name="Mr. "+name+" "+lastName;
                else name = name+" "+lastName;
                
            }
            System.out.println("Then I shall call you "+name);
            System.out.print("\nContinue (y/n)? ");
            cont = sc.next().toLowerCase().charAt(0);
        }while(cont=='y');
        
    }
}
