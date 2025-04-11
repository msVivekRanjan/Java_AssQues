/*
 * Author's Name :  Vivek Ranjan Sahoo
 * Regt. No      :  24107046
 * Section       :  24E1D2
 * Branch        :  CSE Core
 * Question      :  WAP to exchange the values of two variables of integer type X and Y\
 *                  using third temporary variable Z.
 */

import java.util.*;
public class A1Q7 {
	public static void main(String []args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter first Number (X): ");
		int X=sc.nextInt();
		System.out.print("Enter second Number (Y): ");
		int Y=sc.nextInt();
		int Z;
		Z=X;
		X=Y;
		Y=Z;
		System.out.printf("The new value of X is %d and new value of Y is %d",X,Y);
	}
}
