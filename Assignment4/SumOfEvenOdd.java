package Assignment4;

import java.util.Scanner;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the set of Integer:- ");
        int n = sc.nextInt();
        int even=0;
        int odd=0;

        while (n>0){
            int last_number = n%10;
            if(last_number%2==0){
              even+=last_number;
            }else {
                odd+=last_number;
            }
            n=n/10;
        }
        System.out.println("Sum of Odd "+odd);
        System.out.println("Sum of Even "+even);
    }
}
