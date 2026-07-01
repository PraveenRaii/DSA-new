public class recursion{
    public static void count(int i){
        if(i>=12){
            return;
        }
        System.out.println(i);
        count(i+2);
    }
      public static void main(String[] args) {
         count(0);
    }
}



