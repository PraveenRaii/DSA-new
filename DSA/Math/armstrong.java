package Math;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        num = temp;

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, count);
            num /= 10;
        }

        if (sum == temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");

        sc.close();
    }
}
