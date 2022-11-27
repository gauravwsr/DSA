package Assignment4;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:- ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i=0;i<n;i++){
            //fact = fact*(n-i);
            fact *=(n-i);
        }
        System.out.println("Factorial of "+n+"! = "+fact);
    }
}
