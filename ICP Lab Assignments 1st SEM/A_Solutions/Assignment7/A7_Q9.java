import java.util.Scanner;

public class A7_Q9 {
    
    public static double mean(double[] x) {
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum / x.length;
    }

    public static double deviation(double[] x) {
        double meanValue = mean(x);
        double sumSquaredDifferences = 0;
        
        for (double num : x) {
            sumSquaredDifferences += Math.pow(num - meanValue, 2);
        }

        return Math.sqrt(sumSquaredDifferences / (x.length - 1)); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();

        double meanValue = mean(numbers);
        double standardDeviation = deviation(numbers);

        System.out.printf("The mean is %.2f%n", meanValue);
        System.out.printf("The standard deviation is %.5f%n", standardDeviation);
    }
}
