public class reverse {
    public static int[] reverse(int arr[]){
       int  n=arr.length;
       int newarr[ ]= new int[n];
       int j=n-1;
       for(int i=0;i< n ;i++){
        newarr[j]=arr[i];
        j--;
      
       }
       return newarr;
    }

    public static void main(String[] args) {
        int arr[] ={1,4,3};
        int newarr[]=reverse(arr);
        for(int j=0;j<newarr.length;j++){
            System.out.print(newarr[j]+" ");
        }

        
    }
}
