import java.util.Scanner;
public class A6_Q8 {
    public static void palindrome(String str){
        String rev = "";
        str = str.toLowerCase();
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)) System.out.println("The string is a palindrome.");
        else System.out.println("The string is not a palindrome.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        palindrome(str);
        sc.close();
    }
}
