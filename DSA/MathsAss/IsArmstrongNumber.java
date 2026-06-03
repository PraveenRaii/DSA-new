package MathsAss;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long org = n;

        long temp = n;
        int count = 0;

        // Step 1: Count digits
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        long sum = 0;
        temp = n;

        // Step 2: Calculate sum of digit^count
        while (temp > 0) {
            long digit = temp % 10;

            long power = 1;
            int i = 1;

            // calculate digit^count using while
            while (i <= count) {
                power = power * digit;
                i++;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == org) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
