package Assignment6;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:- ");
        int n = sc.nextInt();

//        first half of butterfly
//        outer loop
        for (int i=1;i<=n;i++){
//            inner loop for logic
//            for i starts
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
//            for 2*(n-1) spaces
            for (int k=1;k<=(2*(n-i));k++){
                System.out.print("   ");
            }
            //        for i starts
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

//        For 2nd half
        for (int i=n;i>=1;i--){
//            for i starts
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            for (int j=1;j<=(2*(n-i));j++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
