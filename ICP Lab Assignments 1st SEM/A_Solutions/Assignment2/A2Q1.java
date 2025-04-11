/*
 * Author's Name : Vivek Ranjan Sahoo
 * Regt BNop. : 24017046
 * Section : 24E1D2
 * Ques : Celsius to Fahreinheit
 */
import java.util.*;
public class A2Q1 {

	public static void main(String[] args) {
		//celsius = (F-32)*(5.0/9.0)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temp in fehrenheit: ");
		double F=sc.nextDouble();
		double c = (F-32.0)*(5.0/9.0);
		System.out.println("The temp in celsius is "+c);
		
	}

}
