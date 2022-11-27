import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int marks[] = new int[3];
       System.out.println("Enter the marks");
       marks[0] = sc.nextInt();
       System.out.println("Enter the marks");
       marks[1] = sc.nextInt();
       System.out.println("Enter the marks");
       marks[2] = sc.nextInt();

       int percent = (marks[0]+marks[1]+marks[2])/3;
       System.out.println("Percentage of all "+marks.length+" Subjects = "+percent+"%");
    }
}
