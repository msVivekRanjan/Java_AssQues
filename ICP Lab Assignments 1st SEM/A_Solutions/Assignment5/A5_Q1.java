import java.util.Scanner;
public class A5_Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		int sum1=0, sum2=0;
		for (int i=1; i<num1; i++) if (num1%i==0) sum1 += i;
		for (int i=1; i<num2; i++) if (num2%i==0) sum2 += i;
		
		if (sum1==num2 && sum2==num1) System.out.printf("%d and %d are amicable numbers",num1,num2);
		else System.out.printf("%d and %d are not amicable numbers",num1,num2);
		
		sc.close();
	}
}