package loops;
import java.util.Scanner;

public class sumofDigit {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find sum of digits:");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = n; i>0; i= i/10){
        int digits = i%10;
        sum = sum+digits;
    }
    System.out.println("The sum of digits of " + n + " is: " + sum);
        sc.close();
   } 
}
