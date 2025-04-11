/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program to find the difference between the sum of the squares of the
 * first 10 natural numbers.
 */


public class A4_HWQ1{
    public static void main(String[] args) {
        int n=1,s1=0,s2=0;
        while(n<=10){
            s1+=(n*n);
            s2+=n;
            n++;
        }
        System.out.println("The sum of the squares of the first 10 natural numbers is : "+s1);
        System.out.println("The square of the sum of the first 10 natural numbers is : "+(s2*s2));
        System.out.println("Difference of above two numbers is : "+((s2*s2)-s1));
    }
}