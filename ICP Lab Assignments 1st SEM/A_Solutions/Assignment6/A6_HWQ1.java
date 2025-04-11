import java.util.Scanner;
public class A6_HWQ1 {
    static int index = 0;
    static String s;
    public static void FirstNonRepeatedChar(String str){
        int count = 0;
        s = str.toLowerCase();
        for(int i=0;i<str.length();i++) if(s.charAt(i)==s.charAt(index)) count++;
        if(count==1){
            System.out.println("The first non-repeated character in the string is: "+str.charAt(index));
            return;
        }
        if(++index<str.length()) FirstNonRepeatedChar(str);
        else System.out.println("There are no non-repeated characters in the string.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        FirstNonRepeatedChar(str);
        sc.close();
    }
}
