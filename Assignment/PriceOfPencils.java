package Assignment;

//Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.

import java.util.Scanner;

public class PriceOfPencils {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of pencil you perched :- ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the numbers of pen you perched :- ");
        float pen = sc.nextFloat();
        System.out.println("Enter the numbers of eraser you perched :- ");
        float eraser = sc.nextFloat();
        float bill = (5.32f*pencil)+(10.34f*pen)+(3.34f*eraser);
        float tax = (bill*18)/100;
        float cost = bill+tax;
        System.out.println("Cost Of Your Perched with tax :- "+cost);

    }
}
