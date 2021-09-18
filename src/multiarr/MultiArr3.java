package multiarr;

public class MultiArr3 {
    public static void main(String[] args) {
        int[][] m1 = {
                {1,2,3},
                {4,5,6}
        };
        int[][] m2 = {
                {1,2},
                {3,4},
                {5,6}
        };

        final int ROW = m1.length;
        final int COL = m2[0].length;
        final int M2_ROW = m2.length;
        int[][] arr = new int[ROW][COL];

        for(int i =0;i <ROW;i++){
            for(int j=0;j<COL;j++){
                for(int k =0 ; k<M2_ROW;k++){
                    arr[i][j] = m1[i][k]*m2[k][j];
                }
            }
        }

        for(int[] a : arr){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
