package part1.chapter2.section2_3;

import part1.chapter2.section2_1.InsertionSort;

public class Merge {
//    private static int[] merge(int[] A, int[] B){
//        int[] merged = new int[A.length+B.length];
//        int i=0,j=0,k=0;
//        while(k<merged.length && i<A.length && j<B.length){
//            if (A[i] <= B[j]) {
//                merged[k] = A[i];
//                i++;
//            }else{
//                merged[k] = B[j];
//                j++;
//            }
//            k++;
//        }
//        if(i<A.length){
//            for (;i<A.length;i++,k++)
//                merged[k] = A[i];
//        }else{
//            for (;j<B.length;j++,k++)
//                merged[k] = B[j];
//        }
//        return merged;
//    }

    /**
     *
     * @param A an integer array
     * @param p start index of left array (include)
     * @param q end index of left array (include)
     * @param r end index of right array (include), start index of right array is q+1
     */
    public static void merge(int[] A, int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=p;i<=q;i++){
            left[i-p] = A[i];
        }
        for(int i=q+1;i<=r;i++){
            right[i-q-1] = A[i];
        }

        int i=0,j=0,k=p;
        while(k<r+1 && i<left.length && j<right.length){
            if (left[i] <= right[j]) {
                A[k] = left[i];
                i++;
            }else{
                A[k] = right[j];
                j++;
            }
            k++;
        }
        if(i<left.length){
            for (;i<left.length;i++,k++)
                A[k] = left[i];
        }else{
            for (;j<right.length;j++,k++)
                A[k] = right[j];
        }
    }

    public static void main(String[] args) {
        int[] A = new int[8];
        for (int i=0;i<A.length;i++){
            A[i] = (int)(Math.random()*100);
        }
        InsertionSort.insertionSort(A);

        System.out.println();
        int[] B = new int[8];
        for (int i=0;i<B.length;i++){
            B[i] = (int)(Math.random()*100);
        }
        InsertionSort.insertionSort(B);

        int[] C = new int[A.length + B.length];

        for(int i=0;i<A.length;i++){
            C[i] = A[i];
        }
        for(int i=A.length;i<C.length;i++){
            C[i] = B[i-A.length];
        }

        for (int c : C) {
            System.out.print(c+" ");
        }

        System.out.println();
        merge(C, 0,A.length-1,C.length-1);
        for (int value : C) {
            System.out.print(value+" ");
        }
    }
}
