package Assignment3;

import java.util.Scanner;

public class Fiver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your current body temp:- ");
        double fiver = sc.nextDouble();
        if (fiver<100){
            System.out.println("Your fine!");
        }else {
            System.out.println("You must have to visit your doctor!");
        }
    }
}
