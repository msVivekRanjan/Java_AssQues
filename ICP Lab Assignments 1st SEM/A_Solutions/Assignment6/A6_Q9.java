import java.util.Scanner;
public class A6_Q9 {
    public static boolean PasswordCheck(String str){
        int digitscount=0;
        str = str.toLowerCase();
        if(str.length()<8) return false;
        else {
            for(int i = 0; i<str.length();i++){
                if(str.charAt(i)>='a' && str.charAt(i)<='z');
                else if (str.charAt(i)>='0' && str.charAt(i)<='9' ) digitscount++;
                else return false;
            }
        }
        if(digitscount<2) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String str = sc.nextLine();
        if(PasswordCheck(str)) System.out.println("The password is valid.");
        else System.out.println("The password is invalid.");
        sc.close();
    }
}
