import java.util.Scanner;
public class A7_Q5 {
    public static int secondlargest(int arr[]){
        int max = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            if(arr[i]==max){
                continue;
            }
            else{
                return arr[i];
            }
        }
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of elements in the array: ");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("Enter the elements of the array: ");
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
       }
       sc.close();
       java.util.Arrays.sort(arr);
       System.out.println("Second Largest element : " + secondlargest(arr));

    }
}
