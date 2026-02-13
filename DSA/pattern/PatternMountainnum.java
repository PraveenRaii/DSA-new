package pattern;

public class PatternMountainnum {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
          
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

         
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            
            for (int j = i; j >= 1; j--) {
             
                if (i == n && j == n) {
                    continue; 
                }
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
