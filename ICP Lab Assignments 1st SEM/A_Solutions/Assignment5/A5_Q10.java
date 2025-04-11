import java.util.Scanner;

public class A5_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number n: ");
		int n = sc.nextInt();
		int a = 0,b = 1,c = 1;
		System.out.printf("The sequence till %d is : %d %d %d ",n,a,b,c);
		for (int i=1; i<=(n-3); i++) {
			// since we already know the first three terms so n-3
			int temp = a + b + c;
			System.out.print(temp+" ");
			a = b;
			b = c;
			c = temp;
		}
		sc.close();
    }
}
