/*
 * Author's Name :  Vivek Ranjan Sahoo
 * Regt. No      :  24107046
 * Semester      :  1st Sem
 * Section       :  24E1D2
 * Subject       :  CSE Core
 * Question 10   :  Assume a string variable ruler1 contains "1" initially i.e. String 
 *                  ruler="1". WAP to print the following output using string concatenation
 */
import java.util.*;
public class A1Q10 {
	
	public static void main(String[] args) {
		String ruler1="1";
		System.out.println(ruler1);
		for(int i=2;i<6;i++) {
			ruler1= ruler1+i+ruler1;
			System.out.println(ruler1);
			
		}
	}
	/*
	1
	1 2 1
	121 3 121
	1213121 4 1213121
	121312141213121 5 121312141213121
	*/
}
