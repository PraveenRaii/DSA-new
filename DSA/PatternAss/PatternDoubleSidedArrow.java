package PatternAss;

import java.util.Scanner;

public class PatternDoubleSidedArrow {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int mid = (N / 2) + 1;

        for (int i = 1; i <= N; i++) {

            int rowNum;

            if (i <= mid) {
                rowNum = i;
            } else {
                rowNum = N - i + 1;
            }

            for (int s = 1; s <= (mid - rowNum); s++) {
                System.out.print("    ");   
            }

            for (int j = rowNum; j >= 1; j--) {
                System.out.print(j + " ");
            }

            if (rowNum > 1) {
                int spaces = (2 * rowNum - 3);
                for (int s = 1; s <= spaces; s++) {
                    System.out.print("  ");  
                }

                for (int j = 1; j <= rowNum; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
