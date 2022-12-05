package Assignment7;

import java.util.Scanner;

public class BinarySearch {
    static int Search(int Number[],int key){
        int start = 0;
        int end = Number.length-1;

        while (start <= end){
            int mid = (start+end)/2;

            if (Number[mid] == key){
                return mid;
            }
            if (Number[mid]<key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Key:- ");
        int Key = sc.nextInt();

        int Number[] = {2,4,6,8,10,12,14,16};


        if (Search(Number,Key) == -1){
            System.out.println("Key Not Found!");
        }else {
            System.out.println("Your Key is found at position = "+(Search(Number,Key)+1)); // Index position+1
        }
    }
}
