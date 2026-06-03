package MathsAss;
import java.util.Scanner;

public class SimpleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            sum += num;

            if (sum < 0) {
                break;
            }

            System.out.print(num + " ");
        }

      sc.close();
    }
}
