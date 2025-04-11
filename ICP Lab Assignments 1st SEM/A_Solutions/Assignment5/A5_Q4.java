import java.util.Scanner;

public class A5_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		for (int i = m; i <= n; i++) {
            int FactSum = 1;
			for (int j = 1; j <= i; j++) FactSum *= j;
			System.out.printf("Factorial of %d is: %d\n", i, FactSum);
		}
		sc.close();
    }
}
