package Assignment;

import java.util.Scanner;

public class AreaOFSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Squares:- ");
        int ss = sc.nextInt();
        int areaofsquare = ss*ss;
        System.out.println("Area of Square = "+areaofsquare);
    }
}
