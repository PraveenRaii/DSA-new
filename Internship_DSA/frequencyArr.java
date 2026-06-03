public class frequencyArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 8, 250, 4, 3};
        int[] freq = new int[251]; 
        for(int i =0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i =0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + "-> " + freq[i]);
            }
        }
    }
}
