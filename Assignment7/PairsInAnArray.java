package Assignment7;

import java.util.*;

public class PairsInAnArray {
    public static void main(String[] args) {
        System.out.println("This Program wILL pair all the possible pair of given array!");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array:- ");
        int n = sc.nextInt();
        int pair[] = new int[n];
        System.out.print("Enter the 10 Elements in the Array:- ");

        for (int i=0;i< pair.length;i++){
            pair[i] = sc.nextInt();
        }

        for (int i=0;i< pair.length;i++){
                int curr = pair[i];
            for (int j=i+1;j< pair.length;j++){
                System.out.print("("+curr+","+pair[j]+")");
            }
            System.out.println();
        }
    }
}
