package part1.chapter2.section2_3;

public class MergeSort {
    public static void mergeSort(int[] A, int p, int r){
        if(p < r) {
            int q = (p + r) / 2;
            mergeSort(A,p,q);
            mergeSort(A,q+1,r);
            Merge.merge(A, p, q, r);
        }
    }

    public static void main(String[] args) {
        int[] A = new int[3];
        for (int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
            System.out.print(A[i]+" ");
        }
        System.out.println();
        mergeSort(A, 0, A.length-1);
        for (int a : A) {
            System.out.print(a+" ");
        }
    }
}
