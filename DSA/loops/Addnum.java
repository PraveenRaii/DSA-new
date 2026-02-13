package loops;
import java.util.Scanner;

public class Addnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a A number:");

        int a = sc.nextInt();
        System.out.println("Enter a B number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
            sc.close();
      
    }
}
