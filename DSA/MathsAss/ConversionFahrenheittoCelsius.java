package MathsAss;

import java.util.Scanner;

public class ConversionFahrenheittoCelsius {
     public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();
        int fah = min;
        while(fah <=max){
        int cel = (fah -32)*5/9;
        System.out.println(fah + "\t" + cel);
        fah = fah + step;

        }
  
    sc.close();
}
}
