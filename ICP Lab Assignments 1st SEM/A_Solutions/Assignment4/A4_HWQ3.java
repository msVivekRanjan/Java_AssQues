/*
 * Author's Name       :  Vivek Ranjan Sahoo
 * Author's Regt. No   :  24E119B46
 * Author's Section    :  24E1D2
 * Author's Branch     :  CSE Core
 * Subject             :  ICP (CSE-1001)
 * Problem Description :  Write a java program using one for loop and one if statement, prints
 * the integers from 1000 t0 2000 with five integers per line
 */


public class A4_HWQ3 {
    public static void main(String[] args) {
        for(int i=1000;i<=2000;i++){
            System.out.print(i+" ");
            if((i-1000)%5==4) System.out.println();
        }
    }
}
