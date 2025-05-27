import java.util.Scanner;

public class A3_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your lucky number: ");
            int number = sc.nextInt();
            if (number < 0) {
                throw new NumberFormatException("Negative number entered.");
            }
            System.out.println("Your lucky number is: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}

