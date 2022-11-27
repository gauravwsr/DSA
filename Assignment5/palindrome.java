package Assignment5;

import java.util.Scanner;

public class palindrome {
    public static void Palindrome(int n){
        int number = n;
        int palnum =0;
        while (n>0){
            int last = n%10;
            palnum = last+(palnum*10);
            n=n/10;
        }
        if (number == palnum){
            System.out.println("The given Number "+number+" is an Palindrome number");
        }else {
            System.out.println("The given Number "+number+" is not an Palindrome number");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Numbre:- ");
        int n = sc.nextInt();
        Palindrome(n);
    }
}
