public class A3_Q8 {
}
class power{
    public static int pow(int x,int n){
        if(n>0 && n==1) return x;
        else{
            n--;
            return x*pow(x,n);
        }

    }

    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}