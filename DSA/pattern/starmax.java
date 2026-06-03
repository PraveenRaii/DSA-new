package pattern;

public class starmax {
    public static void main(String[] args) {
         int n = 7;

        for (int i = 0; i <= n / 2; i++) {

            // First row full stars
            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 0; j < n; j++) {

                    if (j == 0 || j == n - 1) {
                        System.out.print("* ");
                    }
                    else if (j == i || j == n - 1 - i) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        for (int i = n / 2 - 1; i >= 0; i--) {

            if (i == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
            }
            else {
                for (int j = 0; j < n; j++) {

                    if (j == 0 || j == n - 1) {
                        System.out.print("* ");
                    }
                    else if (j == i || j == n - 1 - i) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}
// int inp = 7;
// for(int i=0; i<inp; i++){
//     for(int j=0; j<inp; j++){
//         if((i==0 && j<= 6)|| (i==1 && j<= 1) || (i==1 && j>=5)|| (i==2 && j<=0) ||(i==2 && j ==2) ||(i==2 && j ==4) || (i==2 && j>=6) || (i==3 && j<=0)  || (i==3 && j==3)||(i==3 && j>=6) || (i==4 && j<=0) ||(i==4 && j ==2) ||(i==4 && j ==4)||(i==4 && j>=6) || (i==5 && j<= 1) || (i==5 && j>=5) || (i==6 && j<= 6) ){
//             System.out.print("* ");
//         }
//         else{
//             System.out.print("  ");
//         }
//     }
