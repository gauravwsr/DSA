package Assignment6;

import java.util.Scanner;

public class Solid_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        int counter = n;
//        outer loop
        for (int i=1;i<=n;i++){
//            inner loop for logic
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
