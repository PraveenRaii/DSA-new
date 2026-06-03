package MathsAss;
import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        int num = N1;

        while (num <= N2) {

            int temp = num;
            int count = 0;

            // Step 1: Count digits
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }

            temp = num;
            int sum = 0;

            // Step 2: Calculate sum of digit^count
            while (temp > 0) {
                int digit = temp % 10;

                int power = 1;
                int i = 1;

                while (i <= count) {
                    power = power * digit;
                    i++;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            // Step 3: Check Armstrong
            if (sum == num) {
                System.out.println(num);
            }

            num++;  // move to next number
        }
        sc.close();
    }
}
