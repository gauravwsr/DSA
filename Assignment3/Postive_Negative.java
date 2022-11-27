package Assignment3;

import java.util.Scanner;

public class Postive_Negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number:- ");
        int number = sc.nextInt();
         if (number>0){
             System.out.println("Given number "+number+" is positive");
         }else {
             System.out.println("Given number "+number+" is negative");
         }
    }
}
