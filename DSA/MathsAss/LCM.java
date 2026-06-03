package MathsAss;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();  
        int n2 = sc.nextInt();
       int max = Math.max(n1, n2);
       int lcm = max;
       while(true){
           if(lcm % n1 == 0 && lcm % n2 == 0){
               break;
           }
           lcm += max;
       }
       System.out.println(lcm);
       sc.close();
    }
}
