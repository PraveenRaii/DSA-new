package Math;

import java.util.Scanner;

public class pasklrow {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); // Number of rows in Pascal's Triangle
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = 1; // First number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println(); // Move to the next line after each row
        }
        sc.close();
    }
}
