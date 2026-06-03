package MathsAss;

import java.util.Scanner;

public class ReplaceThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
          if(n==0){//input is 0 to this use
            System.out.println(5);
            return;
            
        
        }
        int result = 0;
        int place = 1;
        while(n>0){
            int digit = n % 10;
            if(digit == 0){
               
             digit = 5;
            } 
            result = result+digit*place;
                place = place*10;
            n = n / 10;
        }
        System.out.println(result);
        sc.close();
    }
}
