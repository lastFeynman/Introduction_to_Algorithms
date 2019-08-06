package part1.chapter4.section4_2;

public class StrassenMethod {
    private static int[][] strassen(int[][] A, int B[][]){
        int n = A.length;
        int[][] C = new int[n][n];
        if(n == 1) {
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }

        int mid = (n - 1) / 2;
        int[][] A11 = copySubmatrix(A, 0,mid,0,mid);
        int[][] A12 = copySubmatrix(A, 0,mid,mid+1,n-1);
        int[][] A21 = copySubmatrix(A, mid+1,n-1,0,mid);
        int[][] A22 = copySubmatrix(A, mid+1,n-1,mid+1,n-1);

        int[][] B11 = copySubmatrix(B, 0,mid,0,mid);
        int[][] B12 = copySubmatrix(B, 0,mid,mid+1,n-1);
        int[][] B21 = copySubmatrix(B, mid+1,n-1,0,mid);
        int[][] B22 = copySubmatrix(B, mid+1,n-1,mid+1,n-1);

        int[][] S1 = matrixSubtract(B12, B22);
        int[][] S2 = matrixAdd(A11, A12);
        int[][] S3 = matrixAdd(A21, A22);
        int[][] S4 = matrixSubtract(B21, B11);
        int[][] S5 = matrixAdd(A11, A22);
        int[][] S6 = matrixAdd(B11, B22);
        int[][] S7 = matrixSubtract(A12, A22);
        int[][] S8 = matrixAdd(B21, B22);
        int[][] S9 = matrixSubtract(A11, A21);
        int[][] S10 = matrixAdd(B11, B12);

        int[][] P1 = strassen(A11, S1);
        int[][] P2 = strassen(S2, B22);
        int[][] P3 = strassen(S3, B11);
        int[][] P4 = strassen(A22, S4);
        int[][] P5 = strassen(S5, S6);
        int[][] P6 = strassen(S7, S8);
        int[][] P7 = strassen(S9, S10);

        int[][] C11 = matrixAdd(matrixSubtract(matrixAdd(P5, P4), P2), P6);
        int[][] C12 = matrixAdd(P1, P2);
        int[][] C21 = matrixAdd(P3, P4);
        int[][] C22 = matrixSubtract(matrixSubtract(matrixAdd(P5, P1), P3), P7);

        matrixMerge(C, C11, C12, C21, C22);

        return C;
    }

    static int[][] matrixAdd(int[][] A, int[][] B){
        int n = A.length;
        int[][] C = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    static int[][] matrixSubtract(int[][] A, int[][] B){
        int n = A.length;
        int[][] C = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        return C;
    }

    static int[][] copySubmatrix(int[][] A, int startRow, int endRow, int startCol, int endCol){
        int numRow = endRow - startRow + 1;
        int numCol = endCol - startCol + 1;
        int[][] B = new int[numRow][numCol];
        for(int i=0;i<numRow;i++){
            for(int j=0;j<numCol;j++){
                B[i][j] = A[startRow+i][startCol+j];
            }
        }
        return B;
    }

    static void matrixMerge(int[][] C, int[][] C11, int[][] C12, int[][] C21, int[][] C22){
        int n = C11.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i][j] = C11[i][j];
            }
            for(int j=0;j<n;j++){
                C[i][j+n] = C12[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                C[i+n][j] = C21[i][j];
            }
            for(int j=0;j<n;j++){
                C[i+n][j+n] = C22[i][j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = {{1,2},
                {3,4}};
        int[][] B = {{5,6},
                {7,8}};
        int[][] C = strassen(A, B);
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A.length;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}
