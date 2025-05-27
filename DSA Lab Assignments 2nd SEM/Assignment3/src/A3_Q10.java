public class A3_Q10 {
}

class Fibonacci {

    public static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;  // Base case: first two Fibonacci numbers are 1
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
    }
}

