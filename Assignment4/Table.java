package Assignment4;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();

        for (int i=1;i<=10;i++){
            int mul = n*i;
            System.out.println(n+" x "+i+" = "+mul);
        }
    }
}
