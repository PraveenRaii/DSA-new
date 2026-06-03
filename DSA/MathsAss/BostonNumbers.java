package MathsAss;

import java.util.Scanner;

public class BostonNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int original = n;

        // Step 1: Sum of digits of number
        int sumNumber = 0;
        int temp1 = n;
        while (temp1 > 0) {
            sumNumber += temp1 % 10;
            temp1 /= 10;
        }

        // Step 2: Find prime factors and sum their digits
        int sumFactors = 0;
        int i = 2;
        int temp2 = n;

        while (i * i <= temp2) {
            while (temp2 % i == 0) {
                
                // Find digit sum of factor i
                int factor = i;
                while (factor > 0) {
                    sumFactors += factor % 10;
                    factor /= 10;
                }

                temp2 /= i;
            }
            i++;
        }

        // If remaining number is prime
        if (temp2 > 1) {
            int factor = temp2;
            while (factor > 0) {
                sumFactors += factor % 10;
                factor /= 10;
            }
        }

        // Step 3: Check composite condition
        if (sumNumber == sumFactors && original != temp2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
    }
}
