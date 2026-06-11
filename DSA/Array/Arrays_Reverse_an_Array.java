 import java.util.Scanner;
 public class Arrays_Reverse_an_Array {
 public static int[] revArray(int[] nums){
        int n = nums.length;
        int[] rev = new int[n];
        int j =0;
        for(int i = n-1; i>=0; i--){
            rev[j] = nums[i];
            j++;
        }
        return rev;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i = 0; i<n; i++){
             arr[i]= sc.nextInt();
         }
         int[] result = revArray(arr);
        

         for(int i = 0; i<result.length; i++){
              System.out.println(result[i]+" ");
         }

         sc.nextInt();
    }
}