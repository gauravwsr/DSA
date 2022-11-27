package Assignment6;

import java.util.Scanner;

public class FLOYDs_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n = sc.nextInt();
        int counter=1;
//      Outer loop
        for (int i=1;i<=n;i++){

//      innner loop for logic
            for (int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
