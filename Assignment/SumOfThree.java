package Assignment;
import java.util.*;

public class SumOfThree {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of A B C :- ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int threescore = (a+b+c)/2;
      System.out.println("Sum of A B & C = "+threescore);
    }
}
