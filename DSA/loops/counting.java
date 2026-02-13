package loops;
import java.util.Scanner;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count up to:");
        int n = sc.nextInt();
        for (int i= 1; i<=n ; i++){
            System.out.println("Counting: " + i);
        }
            sc.close();
    }
}
