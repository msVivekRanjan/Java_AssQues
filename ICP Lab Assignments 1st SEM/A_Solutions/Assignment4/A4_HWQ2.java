/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3,5,6 and 9. The sum of these  multiples is 23. Wriet a java program to find the sum of all
 * the multiples of 23. Write a java program to find the sum of all the multiples of 3 or 5 below 1000.
 */


public class A4_HWQ2 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=3;i<1000;i++){
            if(i%3==0 && i%5==0) sum+=i;
            else if (i%3==0 || i%5==0) sum+=i;
        }
        System.out.println("Sum of the multiples of 3 and 5 below 1000 is: "+sum);
    }
}
