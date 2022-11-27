package Assignment5;
import java.util.Scanner;

public class Funtion {
    //Factorial
    public static int factorial(int n){
        int f = 1;
        for (int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int BainomialCo(int n,int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int baino = a/(b*c);

        return baino;
    }

    public static boolean Isprime(int n){
        boolean isprime = true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                isprime = false;
                return isprime;
            }
        }
        return isprime;
    }

    public static void PrintPrime(int n){
        for (int i=1;i<=n;i++){
            if (Isprime(i)){
                System.out.println(i);
            }
        }
    }

    public static void ConvertBi(int binum){
        int mybinum = binum;
        int pow = 0;
        int decnum = 0;

        while (binum >0){
            int last = binum%10;
            decnum = decnum+(last*(int)Math.pow(2,pow));

            pow++;
            binum = binum/10;
        }
        System.out.println("The decimal value of "+mybinum+" = "+decnum);
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("enter the value of factorial:- ");
//        int n = sc.nextInt();
//        int fact = factorial(n);
//        System.out.println("Factorial of number "+n+"! = "+fact);

//        System.out.println(BainomialCo(5,2));
//        PrintPrime(10);
    ConvertBi(1001);
    }

}
