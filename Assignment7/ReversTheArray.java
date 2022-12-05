package Assignment7;

import java.util.*;

public class ReversTheArray {
    public static void main(String[] args){
        System.out.println("This Program Is to Revers the Array!");
        Scanner sc = new Scanner(System.in);
        int  Revers[] = new int[10];
        System.out.print("Enter the Array of 10 Elements in one Line:- ");
        for (int i=0;i<Revers.length;i++){ // this for will take an elements from the user
              Revers[i] = sc.nextInt();
        }
        int start = 0;
        int end = (Revers.length-1);

        while (start<end){ // this loop will revers the element
            int temp = Revers[start];
            Revers[start] = Revers[end];
            Revers[end] = temp;
            start++;
            end--;
        }

        for (int i = 0 ; i< Revers.length;i++){
            System.out.print(Revers[i]+" ");
        }
    }
}
