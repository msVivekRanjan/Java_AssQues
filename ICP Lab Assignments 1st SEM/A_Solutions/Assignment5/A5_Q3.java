import java.util.Scanner;
public class A5_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// Inputs
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.printf("The prime number between %d and %d are:  ", num1, num2);

		for (int num = num1; num < num2; num++) {
            boolean isnumprime = true;
            
            //Check for prime (most efficient way in terms of time complexity)
            if(num%2==0 || num%3==0) isnumprime=false;
            else{
                for (int idx = 5; idx <= Math.sqrt(num); idx+=6) {
                    if (num % idx == 0 || num % (idx + 2) == 0) {
                        isnumprime = false;
                        break;
                    }
                }
            }
			if (isnumprime) System.out.print(num + " ");

		}
    }
}
