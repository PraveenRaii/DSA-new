package PatternAss;

import java.util.Scanner;

public class PatternRhombus {
     public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
     for(int i = 1; i<=n; i++){
         for (int s = i; s<n; s++){
             System.out.print(" ");
         }
         for (int j = i; j < i + i; j++ ){
             System.out.print(j + " ");
         } for(int j = i+i-2; j>=i; j--){
              System.out.print(j + " ");
         }
          System.out.println();
     }
     for(int i = n-1; i>=1; i--){
         for(int s= i; s<n; s++){
             System.out.print(" ");
         }
         for (int j =i; j<i+i; j++){
             System.out.print(j + " ");
         }
         for(int j = i+i-2; j>=i; j--){
              System.out.print(j + " ");
         }
      System.out.println();
     }
     sc.close();
    }
}
