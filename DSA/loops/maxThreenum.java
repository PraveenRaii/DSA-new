package loops;
import java.util.Scanner;

public class maxThreenum {
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Write a A num: ");
    int a = sc.nextInt();
    System.out.println("Write a B num: ");
    int b = sc.nextInt();
    System.out.println("Write a C num: ");
    int c = sc.nextInt();
    if (a>=b && a>=c){
        System.out.println(a + "is maximum");
        
    }
    else if(b>=a && b>=c){
        System.out.println(b + "is maximum");

    }
    else{
        System.out.println(c + "is maximum");
    }
    sc.close();
}}

