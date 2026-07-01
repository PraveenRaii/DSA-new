public class recusionTree {
  static void solve(int i, String s, String op) {

        if (i == s.length()) {
            System.out.println(op);
            return;
        }

        solve(i + 1, s, op + s.charAt(i));

        solve(i + 1, s, op);
    }

    public static void main(String[] args) {
        String s = "abc";
        solve(0, s, "");
    }
}
