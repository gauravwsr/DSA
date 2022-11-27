package Assignment6;

import java.util.Scanner;

public class Inverted_half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the NUmber:-");
        int n = sc.nextInt();
//      outer loop to print row
        for (int i = 1;i<=n;i++){
//      inner loop to print logic
        for (int j=1;j<=(n-i+1);j++){
            System.out.print(j);
        }
        System.out.println();
        }
    }
}
