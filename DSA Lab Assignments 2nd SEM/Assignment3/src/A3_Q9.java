public class A3_Q9 {
}
class reverse{
    public static void rev(int n){
        if(n<=9) System.out.println(n);
        else{
            System.out.print(n%10);
            rev(n/10);
        }

    }

    public static void main(String[] args) {
        rev(4735);
    }
}
