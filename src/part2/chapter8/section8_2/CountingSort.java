package part2.chapter8.section8_2;

public class CountingSort {
    public static void countingSort(int[] A, int[] B, int k){
        int[] C = new int[k+1];
        for(int i=0;i<C.length;i++){
            C[i] = 0;
        }
        for(int i=0;i<A.length;i++){
            C[A[i]]++;
        }
        for(int i=1;i<C.length;i++){
            C[i] = C[i] + C[i-1];
        }
        for(int i = A.length-1; i >= 0; i--){
            B[C[A[i]]-1] = A[i];
            C[A[i]]--;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        for(int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int[] B = new int[10];

        countingSort(A, B, 100);

        for (int a : B){
            System.out.print(a+" ");
        }
    }
}
