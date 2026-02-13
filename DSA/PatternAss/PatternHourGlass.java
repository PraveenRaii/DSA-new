package PatternAss;

import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 2 * n + 1;

        for (int i = 0; i < total; i++) {

            int row = i;

            if (i > n) {
                row = total - i - 1;
            }
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            for (int num = n - row; num >= 0; num--) {
                System.out.print(num + " ");
            }

            for (int num = 1; num <= n - row; num++) {
                System.out.print(num + " ");
            }

            System.out.println();
        }
        sc.close();

    }
}
