package Assignment7;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number[] = {12,22,34,55,64,19,22};
        System.out.println("Enter the Number:- ");
        int n = sc.nextInt();

        for (int i=1;i<= Number.length;i++){
            if (n==Number[i]){
                System.out.println("The Number Found at Position "+i);
                break;
            }
        }
        System.out.println("Number Not Found!");
    }
}
