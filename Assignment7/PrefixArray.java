package Assignment7;
import java.util.*;

public class PrefixArray {
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        int perfix[] = new int[number.length];
        int max = Integer.MIN_VALUE;
        int currSum=0;
        perfix[0] = number[0];
        for(int i=1;i<number.length;i++){
            perfix[i] = perfix[i-1] + number[i];
        }

        for (int i=0;i< number.length;i++){

            for (int j=0 ;j< number.length;j++){
                 currSum = i == 0 ? perfix[j] :  perfix[j] - perfix[i-1];
            }
            if (currSum > max){
                max = currSum;
            }
        }
        System.out.println("Max SumNumber of Array:- "+max);
    }
}
