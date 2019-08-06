package part1.chapter4.section4_2;

public class SquareMatrixMultiply {
    public static int[][] squareMatrixMultiply(int[][] A, int[][] B){
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                int sum = 0;
                for (int k=0;k<n;k++){
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        int[][] A = {{1,2},
                     {3,4}};
        int[][] B = {{5,6},
                     {7,8}};
        int[][] C = squareMatrixMultiply(A, B);
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
