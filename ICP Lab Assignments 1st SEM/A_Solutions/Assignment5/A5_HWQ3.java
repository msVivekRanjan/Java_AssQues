// sin(x) = x^1/1! + x^3/3! + x^5/5! + x^7/7! + ...


import java.util.Scanner;

public class A5_HWQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sine angle in degrees (x): ");
		double x = sc.nextDouble();
		x = x * (Math.PI/180); //Converted in radians
		int n = 1;
		double sum = 0;
		short sign = 1;
		
		while (true){
			// Calc factorial 
			double fact = 1.0d;
			for (double i = 1.0; i <= n; i++) fact *= i;

            double term = sign * (Math.pow(x, n) / fact);
			// termination condition
            if (Math.abs(term) < Math.pow(10, -6)) break;

			sum += term;
			n+=2; // change terms odd numbers
			sign *= -1; // flip sign every iteration
		}
		System.out.println("Calculated result: "+sum);
		System.out.println("System result: "+Math.sin(x));
		
    }
}
