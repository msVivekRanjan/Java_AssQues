/*
 * Author's Name :  Vivek Ranjan Sahoo
 * Regt. No      :  24107046
 * Section       :  24E1D2
 * Branch        :  CSE Core
 * Question 8    :  WAP to exchange the values of two variables of integer type X and Y
 *                  without using the temporary variable.
 */

//import java.util.*;
public class A1Q8 {
	public static void main(String[] args) {
		/*Scanner sc = new Scanner (System.in);
		*System.out.print("Enter first Number (X): ");//2
		*int X=sc.nextInt();
		*System.out.print("Enter second Number (Y): ");//3
		*int Y=sc.nextInt();
		*/
		int X=5,Y=10;
		X=X+Y;//15
		Y=X-Y;//10
		X=X-Y;//5
		System.out.printf("The new value of X is %d and new value of Y is %d",X,Y);
	}

}
