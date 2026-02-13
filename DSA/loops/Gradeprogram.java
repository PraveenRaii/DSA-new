package loops;
import java.util.Scanner;

public class Gradeprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = sc.nextInt();
        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
            
        }
        else if (marks >= 50){
            System.out.println("Grade C");
        }
        else if(marks >= 33){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
            sc.close();
    }
}
