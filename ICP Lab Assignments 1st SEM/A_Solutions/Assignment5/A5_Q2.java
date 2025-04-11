import java.util.Scanner;
public class A5_Q2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		// reversing
		int rev = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            temp /= 10;
            rev = rev * 10 + digit;
        }
        
        boolean isNumPrime = true, isRevPrime = true;
        
        // check if the num and reversed num are prime or not
        if (num % 2 == 0 || num % 3 == 0) isNumPrime = false;
        for (int i = 5; i <= Math.sqrt(num); i+=6) {
            if (num % i == 0 || num%(i+2)==0) {
                isNumPrime = false;
                break;
            }
        }

        for (int i = 2; i <= Math.sqrt(rev); i++) {
            if (rev % i == 0) {
                isRevPrime = false;
                break;
            }
        }
        
        // Output
        if (isNumPrime && isRevPrime) System.out.printf("%d is a twisted prime.", num);
        else System.out.printf("%d is not a twisted prime.", num);
        
        sc.close();
	}
}
