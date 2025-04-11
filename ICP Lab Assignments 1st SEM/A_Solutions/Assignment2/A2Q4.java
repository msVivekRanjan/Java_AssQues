/*
 * Author's Name : Vivek Ranjan Sahoo
 * Mobile no
 * Regt No. : 24017046
 * Section : 24E1D2
 * Subject : CSE Core(CS001)
 * Ques : Sum of digits
 */
import java.util.*;

public class A2Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int x=0;
		while(n>0) {
			x=x+n%10;
			n=n/10;
		}
		System.out.println("The sum of digit is: "+x);
	}

}
