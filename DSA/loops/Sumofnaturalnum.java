package loops;
import java.util.Scanner;

public class Sumofnaturalnum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number to find the sum of n natural numbers:");
         int n= sc.nextInt();
         int sum = 0;
         for (int i = 1; i<=n; i++){
            sum = sum+i;

         }
         System.out.println("The sum of first " + n + " natural numbers is: " + sum);
             sc.close();
    }
}
