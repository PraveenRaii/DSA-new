public class zeroSunsubArr {
     public static void main(String[] args) {

        int[] arr = {10, -2, 4, -2, 7, 3};

        for(int i = 0; i < arr.length; i++) {

            int sum = 0;

            for(int j = i; j < arr.length; j++) {

                sum += arr[j];

                if(sum == 0) {
                    System.out.println("Zero Sum Subarray Found");
                    
                    for(int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                }
            }
        }
    }
}
