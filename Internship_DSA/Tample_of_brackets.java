import java.util.Scanner;

public class Tample_of_brackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        boolean valid = true;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{' ){
                temp += ch;
            }else{
                if(temp.length() ==0){
                    valid = false;
                    break;
                }
                char last = temp.charAt(temp.length() -1);
                if((ch == ')' && last =='(')||
                    (ch== ']' && last == '[') ||
                        (ch == '}' && last == '{')){
                            temp = temp.substring(0, temp.length() -1);
                        }else{
                            valid = false ;
                            break;
                        }

            }
        }
        if(temp.length() !=0){
            valid = false;
        }
        if(valid){
            System.out.println("Yes");
        }
            else{
            System.out.println("No");
        }
    }
}
