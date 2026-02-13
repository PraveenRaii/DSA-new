package PatternAss;

import java.util.Scanner;

public class MirrorStarPattern5 {
      public static void main(String args[]) {
              Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int mid = n / 2;

        for (int i = 0; i < n; i++) {

            int star;
            int space;

            if (i <= mid) {
                star = 2 * i + 1;
                space = mid - i;
            } else {
                star = 2 * (n - i) - 1;
                space = i - mid;
            }

            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            
            for (int j = 0; j < star; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
