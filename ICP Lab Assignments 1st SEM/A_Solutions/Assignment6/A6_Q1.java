import java.util.Scanner;
public class A6_Q1 {

    public static int add(int x, int y) {return x + y;}
	
	public static int subtract(int x, int y) {return y - x;}
	
	public static int multiply(int x, int y) {return x * y;}
	
	public static int remainder(int n, int m) {return m % n;}

	public static double divide(int x, int y) {
		if (x == 0) {
			System.out.println("Cannot divide by zero.");
			return 0;
		} else return y / x;
	}
	public static double sqroot(int n) {
		if (n < 0) {
			System.out.println("The result is complex as the number is negative.");
			return 0;
		} else 	return Math.sqrt(n);
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        String [] op = {"Addition", "Subtraction", "Multiplication", "Division", "Remainder", "Square Root", "Exit"};
        System.out.println("Select the operation you want to perform: ");
        for (int i = 0; i < op.length; i++) System.out.println(i + " - " + op[i]);
		do {
			System.out.print("\nEnter your choice: ");
			n = sc.nextInt();
			System.out.println("You selected " + op[n]);
			if (n >= 0 && n <= 4) {
				System.out.print("Enter value x: ");
				int x = sc.nextInt();
				System.out.print("Enter value y: ");
				int y = sc.nextInt();

				switch (n) {
				case 0:
					System.out.printf("%d + %d = %d", x, y, add(x, y));
					break;
				case 1:
					System.out.printf("%d - %d = %d", y, x,subtract(x, y));
					break;
				case 2:
					System.out.printf("%d x %d = %d", x, y, multiply(x, y));
					break;
				case 3:
					System.out.printf("%d / %d = %d", x, y, divide(x, y));
					break;
				case 4:
					System.out.printf("%d % %d = %d", x, y, remainder(x, y));
					break;
				}
			} else if (n == 5) {
				System.out.print("Enter value x: ");
				int x = sc.nextInt();
				System.out.println("Sqaure root of " + x + " = " + sqroot(x));
			} else if (n == 6) {
				System.out.println("Exiting Program...");
				break;
			} else System.out.println("Invalid choice. Please try again.");

		} while (true);
		sc.close();

	}

}


	
	