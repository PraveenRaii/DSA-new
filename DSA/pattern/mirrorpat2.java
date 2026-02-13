package pattern;
import java.util.Scanner;

public class mirrorpat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
int mid = n/2;
int i =0;
while(i<n){
    if (i<mid) {
        int j =0;
        while(j<i+1){
            System.out.print("*");
            j++;
        }
    }
    else{
        int j =0;
        while(j<(n+1)-i){
            System.out.print("*");
            j++;
        }
        
    }
    System.out.println();
    i++;
}
sc.close();
}
}
