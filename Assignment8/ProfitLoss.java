package Assignment8;
// You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
// Return the maximum profit you can achieve from this transaction.
// If you cannot achieve any profit, return 0

import java.util.*;

public class ProfitLoss {
    public static int ProfitL(int prices[]){
        int buyingP = prices[1];
        for (int i=2;i<prices.length;i++){
            int SellingP = 0;
//            int

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prices[] = new int[6];
        System.out.print("Enter the Prices upto 6 day's :-");
        for (int i=0;i< prices.length;i++){
            prices[i] = sc.nextInt();
        }

        System.out.println(ProfitL(prices));
    }
}
