/*
 * Author's Name : Vivek Ranjan Sahoo
 * Regt No. : 24017046
 * Section : 24E1D2
 * Subject : CSE Core(CS001)
 * Ques : Salary Management
 */

import java.util.*;
public class A2Q3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		int sal=sc.nextInt();
		double DA=0.4*sal;
		double HRA=0.2*sal;
		double gross=sal+DA+HRA;
		System.out.println("DA is "+DA+"\nHRA is "+HRA+"\nGross Salary is "+gross);
	}

}
