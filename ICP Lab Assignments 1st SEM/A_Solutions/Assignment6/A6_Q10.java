import java.util.Scanner;
public class A6_Q10 {
    public static double area(double a,double b, double c){
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public static double area(int a){return a*a;}
    public static double area(double r){return Math.PI*r*r;}
    public static double area(double a, double b){return a*b;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the type of shape: \n1. Triangle\n2. Square\n3. Circle\n4. Rectangle\nType your choice: ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Enter the sides of the triangle: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                System.out.println("The area of the triangle is: "+area(a,b,c));
                break;
            case 2:
                System.out.println("Enter the side of the square: ");
                int s = sc.nextInt();
                System.out.println("The area of the square is: "+area(s));
                break;
            case 3:
                System.out.println("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                System.out.println("The area of the circle is: "+area(r));
                break;
            case 4:
                System.out.println("Enter the sides of the rectangle: ");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                System.out.println("The area of the rectangle is: "+area(l,w));
                break;
            default:
                System.out.println("Invalid choice.");
        } 
    }
}
