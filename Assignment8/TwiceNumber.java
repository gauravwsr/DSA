package Assignment8;

import java.util.*;

public class TwiceNumber {
    public  static boolean FindTwiceNum(int number[]){
        for (int i = 0;i< number.length-1;i++){
            for (int j=i+1;j< number.length;j++){
                if (number[i]==number[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array:- ");
        for (int i=0;i< number.length;i++){
            number[i]=sc.nextInt();
        }
        System.out.println(FindTwiceNum(number));
    }
}
