package PatternAss;

import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = i; j<n; j++){
                System.out.print(" " );
            }
            for(int k = i; k<i+i; k++){
                  System.out.print(k +" " );
            }
             for(int k = i+i-2; k>=i; k--){
                  System.out.print(k +" " );
            }
              System.out.println();
        }
    sc.close();
    }
}
