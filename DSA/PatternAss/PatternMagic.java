package PatternAss;

import java.util.Scanner;

public class PatternMagic {
     public static void main (String args[]) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = 2 * n - 1;

        for(int i = 1; i <= total; i++) {

            for(int j = 1; j <= total; j++) {

                if(i <= n) {
                    if(j <= n - i + 1 || j >= n + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } 
                else {
                    if(j <= i - n + 1 || j >= total - (i - n)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
        sc.close();

    }
}
