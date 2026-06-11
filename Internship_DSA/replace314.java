public class replace314{
  public static void main(String[] args) {
        String str = "3.14pi3.143.143.14pipi";
       char[] ch = str.toCharArray();

        String result = "";

        for (int i = 0; i < ch.length; i++) {

            if (i + 3 < ch.length &&
                ch[i] == '3' &&
                ch[i + 1] == '.' &&
                ch[i + 2] == '1' &&
                ch[i + 3] == '4') {

                result += 'p';
                result += 'i';
                i += 3;

            } else {
                result += ch[i];
            }
        }
         System.out.println(result);
    }
}