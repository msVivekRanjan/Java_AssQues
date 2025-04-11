import java.util.Scanner;

public class A5_Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int termsum = 0;
			for (int j = 1; j <= i; j++) termsum += j;
			
			sum += termsum;
		}
		System.out.println("The Sum of the series is: " + sum);
    }
}
