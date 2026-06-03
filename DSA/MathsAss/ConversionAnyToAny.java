package MathsAss;

import java.util.Scanner;

public class ConversionAnyToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();
        int decimal = 0;
        int pow = 1;
        while (sn > 0) {
            int digit = sn % 10;
            decimal = decimal + digit * pow;
            pow = pow * sb;
            sn = sn / 10;
        }
        int result = 0;
        int power = 1;
        while (decimal > 0) {
            int digit = decimal % db;
            result = result + digit * power;
            power = power * 10;
            decimal = decimal / db;
        }
        System.out.println(result);
        sc.close();
    }
}
