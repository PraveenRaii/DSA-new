package Math;

import java.util.Scanner;

public class gcd2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
      int b = sc.nextInt();
        
       int min = (a < b) ? a : b;   // find smaller number

        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("GCD = " + i);
                break;   // stop after first match
            }
        }
      sc.close();
        } 
    }
    

