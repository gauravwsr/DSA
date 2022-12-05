package Assignment7;

import java.util.*;

public class Kadanes {
    public static void spacialCaseKadnes(int number[]){
        int cs = 0;
        int mins = Integer.MAX_VALUE;

        for (int i=0;i< number.length;i++){
            if (number[i] < 0){
                cs = cs + number[i];
            }else {
                break;
            }
            mins = Math.min(cs,mins);
        }
        System.out.println("our min subarray sum is:- "+mins);
    }
    public static void kadnes(int number[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i< number.length;i++){
            cs = cs + number[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is:- "+ms);
    }
    public static void main(String[] args) {
//        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//        kadnes(number);
        int number[] = {-1,-2,-3,-4};
        spacialCaseKadnes(number);
    }
}
