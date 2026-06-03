package MathsAss;
import java.util.Scanner;

public class Chewbacca_andNumber {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        
        String num = Long.toString(x);
        String result = "";
        
        int i = 0;
        while (i < num.length()) {
            int digit = num.charAt(i) - '0';
            int inverted = 9 - digit;
            
            // Special case: first digit should not become 0
            if (i == 0 && inverted == 0) {
                result += digit;
            }
            else {
                if (inverted < digit) {
                    result += inverted;
                } else {
                    result += digit;
                }
            }
            i++;
        }
        
        System.out.println(result);
    }
}
