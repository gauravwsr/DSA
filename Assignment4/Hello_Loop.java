package Assignment4;

import java.util.*;

public class Hello_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:- ");
        int n = sc.nextInt();
        int i = 1;
        while (i<=n){
            System.out.println("hello loop "+i);
            i++;
        }
    }
}
