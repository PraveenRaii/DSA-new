package pattern;
public class numptt2 {
    public static void main(String[] args) {

       int n =3;
       for (int i =1; i<=n; i++){
          for (int j = i; j<n; j++){
            System.out.print(" ");
          } 
          for(int k =i; k<i+i; k++){
            System.out.print(k + "");
          }
       
          System.out.println();
           }
       }
    }

