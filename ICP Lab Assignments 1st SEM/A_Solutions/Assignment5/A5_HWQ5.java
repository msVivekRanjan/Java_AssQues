import java.util.Scanner;

public class A5_HWQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of terms (n): ");
		int n = sc.nextInt();
		int a = 0, b = 1;
		if (n <= 0) System.out.println("Only positive numbers.");
		else if (n == 1) System.out.println("Fibonacci Series is: 0");
		else if (n == 2) System.out.println("Fibonacci Series is: 0, 1");
		else {
			System.out.print("Fibonacci Series is: 0 1 ");
			for (int i = 1; i <= n - 2; i++) {
				int c = a + b;
				System.out.print(c+" ");
				a = b;
				b = c;
			}
		}
		sc.close();
    }
}
