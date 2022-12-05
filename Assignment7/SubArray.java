package Assignment7;

import java.util.*;

public class SubArray {
    public static void printsubarray(int subarray[]){
        int CurrSum ;
        int maxSum = Integer.MIN_VALUE;
        for (int i=0;i< subarray.length;i++){

            for (int j=i; j< subarray.length;j++){
                 CurrSum = 0;
                for (int k=i;k<=j;k++){
                    CurrSum += subarray[k];
                }
                System.out.print(CurrSum+" ");
                if (maxSum < CurrSum){
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println(" = "+maxSum+" ");
    }

    public static void main(String[] args) {
        int subarray[] = {2,4,6,8,10};
        printsubarray(subarray);

    }
}
