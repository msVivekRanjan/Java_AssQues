import java.util.Scanner;
public class A6_Q6 {
    public static int count(String str, char a){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==a) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter a character: ");
        char a = sc.next().charAt(0);
        System.out.println("The character "+a+" appears "+count(str,a)+" times in the string.");
    }
}
