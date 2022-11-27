package Assignment7;

import java.util.*;

public class LargestNumber {

    public static int FindNumber(int number[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i=0;i< number.length;i++){
            if (largest < number[i]){
                largest = number[i];
            }
            if (smallest>number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest value of the array is = "+smallest);
        return largest;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = {23,4,53,5,68,87,99};
        System.out.println(FindNumber(number));
    }
}
