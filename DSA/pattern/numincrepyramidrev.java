package pattern;
public class numincrepyramidrev {
    public static void main(String[] args){
        int n= 5;
        for(int i=1; i<=n; i++){
            int start = n - i + 1;
            for(int j = start; j <= n; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// 5 
// 4 5 
// 3 4 5 
// 2 3 4 5 
// 1 2 3 4 5 