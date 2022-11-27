package Assignment5;

import java.util.Scanner;

public class Sum_Of_Integer {

    public static void SumOfInteger(int n){
        int num = n;
        int sum=0;
        if (n<=0){
            System.out.println("Your Value can not be added! ");
        }
        while (n>0){
            int lastnum = n%10;
            sum = sum+lastnum;
            n = n/10;
            }
        System.out.println("The Sum of "+num+" = "+sum);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        System.out.print("Enter the Integer:- ");
        int n = sc.nextInt();
        SumOfInteger(n);
    }
}
