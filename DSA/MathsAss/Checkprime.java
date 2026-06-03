package MathsAss;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          if(n<=1){
              System.out.println("Not Prime");
              return;
              
          }
          int i = 2;
          while(i*i<=n){
              if(n%i == 0){
                   System.out.println("Not Prime");
                   return;
              }
              i++;
            }
            System.out.println("Prime");
            sc.close();
            
    }
}
