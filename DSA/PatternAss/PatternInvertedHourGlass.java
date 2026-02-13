package PatternAss;

import java.util.Scanner;

public class PatternInvertedHourGlass {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int total = 2 * N + 1;

        for (int i = 0; i < total; i++) {

            int row = (i <= N) ? i : (2 * N - i);

           
            for (int j = N; j >= N - row; j--) {
                System.out.print(j + " ");
            }

            if (row == N) {
                
                for (int j = 1; j <= N; j++) {
                    System.out.print(j + " ");
                }
            } 
            else {
              
                int spaces = 2 * (N - row) - 1;
                for (int s = 0; s < spaces; s++) {
                    System.out.print("  ");
                }

              
                for (int j = N - row; j <= N; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
        sc.close();
    }
}
