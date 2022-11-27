package Assignment7;

import java.util.Scanner;

public class InputOutputInArray {
    public static void printArray(int marks[]){
        for (int i = 0;i< marks.length;i++){
            marks[i]= marks[i]+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[]  = { 99,96,97};
        printArray(marks);
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
