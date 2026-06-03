package pattern;
public class swastik {
public static void main(String[] args) {
    int row = 7;
    int col = 7;
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(i==3 || j==3 || (i==0 && j>=3) || (i==6 && j<=3) || (j==0 && i<=3) || (j==6 && i>=3)){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}
