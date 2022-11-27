package Assignment6;

import java.util.Scanner;

public class InvertTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int n = sc.nextInt();

//        outer loop to print the row
        for (int i=1;i<=n;i++){
//        1st inner loop to print spaces
            for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
            }
//         2nd inner loop to print starts
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}