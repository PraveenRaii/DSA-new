package pattern;

public class PatternMountainnum {
    public static void main(String[] args) {
        int n = 4; // Total rows

        for (int i = 1; i <= n; i++) {
            // 1. Increasing part: 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 2. Spaces: Decreases as i increases
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // 3. Decreasing part: i down to 1
            for (int j = i; j >= 1; j--) {
                // If it's the last row and we are at the start of this loop (j == n),
                // skip printing to avoid a double 4.
                if (i == n && j == n) {
                    continue; 
                }
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
