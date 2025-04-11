//Problem Statement : WAP to convert integer to its corresponding octal representation
import java.util.Scanner;

public class A7_Q7 {
    
    // Convert integer part to octal
    public static String convertIntegerToOctal(int number) {
        String octal = "";
        while (number > 0) {
            int remainder = number % 8;
            octal+=remainder;
            number /= 8;
        }
        return (octal.length() > 0) ? octal : "0";
    }

    // Convert fractional part to octal (up to 6 decimal places)
    public static String convertFractionToOctal(double fraction) {
        String octalFraction = "";
        int precision = 6;  // Limit decimal places
        
        while (fraction > 0 && precision > 0) {
            fraction *= 8;  // Multiply by 8
            int digit = (int) fraction;  // Extract integer part
            octalFraction+=digit;
            fraction -= digit;  // Remove integer part
            precision--;
        }
        
        return octalFraction;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double decimalNumber = scanner.nextDouble();
        scanner.close();
        
        int integerPart = (int) decimalNumber;
        double fractionalPart = decimalNumber - integerPart;
        
        String octalInteger = convertIntegerToOctal(integerPart);
        String octalFraction = convertFractionToOctal(fractionalPart);

        System.out.println("Octal representation: " + octalInteger + (octalFraction.isEmpty() ? "" : "." + octalFraction));
    }
}
